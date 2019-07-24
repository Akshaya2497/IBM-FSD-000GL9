const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');
const search = require('./services/search').searchItems;
const validate = require('./services/security.service').validate;
const products = require('./dbs/products').products;
server.use(parser.json());
server.use(cors);
server.get('/status',(rq,rs)=>{
    rs.status(200).json({
        products : products
    });
});
server.get('/searchItem',(req,res)=>{
    res.setHeader('content-type','application/json');
    
    
   
    res.end(
        JSON.stringify({
           message : it is working
        }));
    
    });

server.use('/employees',(rq,rs,next)=>{
    validate(rq,rs,next);
});



//server.use('/users',useRoutes);
server.listen(1234,()=>{
    console.log('Server started at 1234');
});
module.exports.server = server;
