'use strict'

const express = require('express')
const app = express()
const database = require('mysql')

app.use(express.json())
app.use(express.static(__dirname + '/assets'))

const connection = database.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'password',
    database: 'sales',
})

connection.connect(function(err) {
    if (err) console.log('Could not connect to DB!')
})
   
app.get('/', function (req, res) {
    res.sendFile(__dirname + '/index.html')
})

app.get('/best', function (req, res) {
    let sqlQuery = `SELECT DISTINCT Account, currency, account_type, salesperson_id, order_status, order_date, SUM(number_of_product_sold) as products_sold, unit_price, ( SUM(number_of_product_sold) *unit_price) as Revenue,
        name, product_name FROM orders
        JOIN salesperson ON orders.Salesperson_ID = salesperson.Id 
        JOIN products ON products.product_Id=orders.product_Id 
        WHERE order_status LIKE "Submitted_vod" 
        GROUP BY name 
        ORDER BY revenue DESC, number_of_product_sold 
        DESC  LIMIT 3;`

    connection.query(sqlQuery, function (err, rows) {
        if (err) {
            console.log('Could not get data')
        } else {
            res.send(
                {
                    "data": rows
                })
        }
    })
})

app.get('/costumer-sold', function (request, response) {
    let sqlQuery = `SELECT Account, SUM(number_of_product_sold) as products_sold FROM orders WHERE Account LIKE "${request.query.Account}%" 
                    AND  order_status="submitted_vod" GROUP BY Account;`
   
    connection.query(sqlQuery, function (err, costumer) {
        if (err) {
            console.error('Could not get data' + err.toString())
            return
        }

        response.send(
            {
                "data": costumer
            })
    })
    
})

app.get('/chart', function (request, response) {

    let sqlQuery = `SELECT Account, SUM(number_of_product_sold) as products_sold, MONTH(order_date) as month FROM orders WHERE order_status = "submitted_vod" GROUP BY MONTH(order_date);`

    connection.query(sqlQuery, function (err, chart) {
        if (err) {
            console.error('Could not get data' + err.toString())
            return
        }
        response.send(
            {
            "data": chart
        })
    })

})


app.listen(3000, function () {
    console.log('Server is running on port 3000 :)')
})

