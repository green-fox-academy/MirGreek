//'use strict'

const express = require('express')
const app = express()
const database = require('mysql')

app.use(express.json())
app.use(express.static(__dirname + '/assets'))

const connection = database.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'password',
    database: 'foxy'
})


connection.connect(function(err){
    if (err){
        console.log('Error connectiong DB!')
        return;
    }
})

app.get('/', function(request, response) {
    response.sendFile(__dirname + '/index.html')
})

app.get('/warehouse', function(request, response){

    let sqlQuery = `SELECT * FROM warehouse;` //nem sima macskaköröm!

    connection.query(sqlQuery, function(err, tableRows){
        if(err){
            console.error(err.toString());
            response.status(500).send('Database error');
            return;
        }
        response.send(
            {
               "data": tableRows
            }

        )
    })
})

///price-check/?item=[string]&size=s&quantity=[integer]
app.get('/price-check', function(request, response){
   
    let sqlQuery = `SELECT * FROM warehouse WHERE item_name LIKE "%${request.query.item}%" AND size ="${request.query.size}" AND in_store >= "${request.query.quantity}";`
    
    connection.query(sqlQuery, function(err, tableRows){
        if(err){
            console.error(err.toString());
            return;
        }

        response.send(
            {
                "data": tableRows,
                "total_price": request.query.quantity * tableRows[0].unit_price
            }
        )
    })
    
})

app.listen(3522, function(){
    console.log('Server is on... port 3522')
})