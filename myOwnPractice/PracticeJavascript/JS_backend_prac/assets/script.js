'use strict'

let input = document.querySelector('#input')
let button = document.querySelector('#button')
let container = document.querySelector('#container')
let table = document.querySelector('#table')

button.addEventListener('click', function(){
    container.innerHTML += '<br>'
    container.innerText +=  input.value
})

let serverButton = document.querySelector('#backend-info')

serverButton.addEventListener('click', function(){ //asyncronous javascript and xml
    ajax('GET', '/kaka', getTable) //get/post..., url, callback
})

function ajax(method, url, callback) {      //callback is for the response and it will be a function what to do with it
    let xhr = new XMLHttpRequest()     // request created
    xhr.open(method,url)       //request opens on, with
    xhr.onload = function (){     // onload -> 200 http satus, OK (itt állítható, hogy mi történik 404 stb error esetén)
        callback(JSON.parse(xhr.responseText))     //responsetext is what we get back from the server, it has to be parsed to JSON type
    }
    xhr.send()      //we send the request
}

function getTable(responseString){
    //info.innerText = responseString.data.mir
    table.innerHTML = 
    `<tr>
        <th> Name </th>
        <th> Skill </th>
        <th> Dog</th>
        <th> Partner </th>
    </tr>
    `
    responseString.data.forEach(element => {
        table.innerHTML += 
        `<tr>
            <td>${element.name}</td>
            <td>${element.skill}</td>
            <td>${element.dog}</td>
            <td>${element.partner}</td>
        </tr>
        `
    });
}