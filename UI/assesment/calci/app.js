const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');
const calculate = require('./api/calciapi').calculate;
const user = require('./api/userapi').user;
server.use(parser.json());
server.use(cors());
server.get('/status',(req,res)=>{
    //res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        message : "Server Started"
    }))

});
server.use('/calci',calculate);
server.use('/user',user);
server.listen(1234,()=>{
    
    console.log('Server started at 1234');
});
