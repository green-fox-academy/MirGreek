'use strict'

const port = 'http//:localhost:3000'

const CHART = document.querySelector('#chart').getContext('2d')

let tableTop3 = document.querySelector('#table-top3')
let search = document.querySelector('#search')
let button = document.querySelector('#button')
let container = document.querySelector('#container')


var pieChart = new Chart(CHART, {
    type: 'bar',
    data: {
        labels: [], //'jan', 'feb', 'march'
        datasets: [{
            label: 'Sold to costumer per month',
            data: [],
            backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)',
                'rgba(255, 159, 64, 0.2)'
            ]
        }]
    }
})    

//console.log(pieChart.data.datasets[0].data)


function ajax (method, url, callback ) {  //ajax(GET, url, callback/response)
    let xhr = new XMLHttpRequest()
    xhr.open(method, url)
    xhr.onload = function (){
        callback(JSON.parse(xhr.responseText)) // response = JsON(parse(xhr.responseText))
    }
    xhr.send()
}

function getFullTable(response){
    tableTop3.innerHTML = `<thead class="thead-dark">
                            <tr>
                                <th class="text-center">Account</th>
                                <th class="text-center">Currency</th>
                                <th class="text-center">Account type ID</th>
                                <th class="text-center">Salesperson Id</th>
                                <th class="text-center">Order status</th>
                                <th class="text-center">Order date</th>
                                <th class="text-center">Number of product sold</th>
                                <th class="text-center">Unit price</th>
                                <th class="text-center">Revenue</th>
                                <th class="text-center">Sales name</th>
                                <th class="text-center">Product name</th>
                            </tr>
                            </thead>`
    
    response.data.forEach(element => {
        tableTop3.innerHTML += `
                                <tr>
                                    <td>${element.Account}</td>  
                                    <td>${element.currency}</td>  
                                    <td>${element.account_type}</td>
                                    <td>${element.salesperson_id}</td>
                                    <td>${element.order_status}</td>
                                    <td>${element.order_date}</td>
                                    <td>${element.products_sold}</td>
                                    <td>${element.unit_price}</td>
                                    <td>${element.Revenue}</td>
                                    <td>${element.name}</td>
                                    <td>${element.product_name}</td>
                                 </tr>`
        
    }); 
}

function getChart(response) {
    let labels = []

    response.data.forEach(element =>{
            labels.push(element.Account)
    })
    addData(pieChart,labels,response.data)

}
function addData(chart,labelList, sqlData) {
    for (let i = 0; i<labelList.length; i++) {
        chart.data.labels.push(labelList[i]);
    }

    let array = []
    for(let i = 0; i< sqlData.length; i++) {
        array.push(sqlData[i].products_sold)
    }

    chart.data.datasets.forEach((element) => {
       for(let i = 0; i< array.length; i++) {
           element.data.push(array[i]);
       }
        
    });
    chart.update();
}
/* eredeti function:
function addData(chart, label, data) {
    chart.data.labels.push(label);
    chart.data.datasets.forEach((dataset) => {
        dataset.data.push(data);
    });
    chart.update();
}
*/


function getCostumer(response){
    response.data.forEach(element => {
        container.innerText = element.Account + ' nevű cég ennyit vásárolt:  '
        container.innerText += element.products_sold + 'db'
    })
}

button.addEventListener('click', function(){
    let query = `/costumer-sold?Account=${search.value}`
    ajax('GET', query, getCostumer)
})

ajax('GET', '/chart', getChart)
ajax('GET', '/best', getFullTable)