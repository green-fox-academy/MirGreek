'use strict'

const port = 'http://localhost:3522'

let price
let pullover = document.querySelector('#pullover')
let size = document.querySelector('#size')
let inputField = document.querySelector('#quantity')
let button = document.querySelector('#button')
let container = document.querySelector('#container')
let table = document.querySelector('#table')

function ajax (method, url, callback ) {  //ajax(GET, url, callback)
    let xhr = new XMLHttpRequest()
    xhr.open(method, url)
    xhr.onload = function (){
        callback(JSON.parse(xhr.responseText)) // response = JsON(parse(whr.responseText))
    }
    xhr.send()
}

function getTable(response){       
    table.innerHTML =  //item_name, manufacturer, category, size, unit_price, in_store
    `<tr>
        <th> Item name </th>
        <th> Manufacturer </th>
        <th> Category</th>
        <th> Size </th>
        <th> Unit price </th>
        <th> In store </th>
    </tr>`
    
    response.data.forEach(element => {
        table.innerHTML +=
        `<tr>
            <td>${element.item_name}</td>
            <td>${element.manufacturer}</td>
            <td>${element.category}</td>
            <td>${element.size}</td>
            <td>${element.unit_price}</td>
            <td>${element.in_store}</td>
            </tr>`
    
    });
    price = response.total_price
    getTotalPrice(price)
}

function getTotalPrice(){
    if (inputField.value > 3){
        container.innerText = price
    } else if (inputField.value === '') {
        container.innerText = ''
    } else {
        container.innerText = 'Helló, túl keveset rendeltél!'
    }
}

button.addEventListener('click', function(){
    let query = `/price-check?item=${pullover.value}&size=${size.value}&quantity=${inputField.value}`
    ajax('GET', query, getTable)
})



ajax('GET', '/warehouse', getTable)