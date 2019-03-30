const express = require('express') //import package of express to this file
const server = express() //use express, save into variable

server.use(express.json())  //json usage of express is set
server.use(express.static(__dirname + '/assets')) // use other: script, css files of frontend is set

server.get('/', function (request, response){
    response.sendFile(__dirname + '/index.html')
})

server.get('/kaka', function(request, response){
    response.send({
        key: 'Minden okci',
        data:[ {
            name: 'Mir',
            skill: 'okos',
            dog: 'Nessie',
            partner: 'Manócs'
        },
        {
            name: 'Kamo',
            skill: 'intelligens',
            dog: 'Nessie',
            partner: 'Mir'
        }
    ]
    })
})


server.listen(3022, function (){
    console.log('The server is running on the 3022 port...')
})