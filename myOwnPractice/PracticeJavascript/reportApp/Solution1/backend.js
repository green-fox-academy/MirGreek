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
    if(err){
        console.log('Could not connect to DB!')
    }
})
   
app.get('/',function(req, res){
    res.sendFile(__dirname + '/index.html')
})

app.get('/best', function(req, res){

    let sql =`SELECT DISTINCT Account, currency, account_type, salesperson_id, order_status, order_date, SUM(number_of_product_sold) as products_sold, unit_price, ( SUM(number_of_product_sold) *unit_price) as Revenue, name, product_name FROM orders JOIN salesperson ON orders.Salesperson_ID = salesperson.Id JOIN products ON products.product_Id=orders.product_Id WHERE order_status LIKE "Submitted_vod" GROUP BY Account ORDER BY revenue DESC LIMIT 3;`
    connection.query(sql, function(err,rows){
        if (err){
            console.log('Could not get data')
        } else {
            res.send(
                {
                    "data": rows
                }
            )
        }
    })
})

app.get('/costumer-sold', function(request, response){
   
    let sqlQuery = `SELECT Account, SUM(number_of_product_sold) as products_sold FROM orders WHERE Account LIKE "%${request.query.Account}%";`
    
    connection.query(sqlQuery, function(err, costumer){
        if(err){
            console.error('Could not get data' + err.toString());
            return;
        }

        response.send(
            {
                "data": costumer
            }
        )
    })
    
})

app.get('/chart', function (request, response){

    let sqlQuery = `SELECT Account, MONTH(order_date) as month, SUM(number_of_product_sold) as products_sold FROM orders GROUP BY MONTH( order_date);`

    connection.query(sqlQuery, function(err, chart){
        if(err){
            console.error('Could not get data' + err.toString());
            return;
        }
        response.send({
            "data": chart
        })
    })

})


app.listen(3000, function(){
    console.log('Server is running on port 3000 :)')
})

