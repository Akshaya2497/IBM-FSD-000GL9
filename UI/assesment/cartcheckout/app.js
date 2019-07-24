const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');
//const search = require('./services/search').searchItems;
const user = require('./routes/users').user;
const checkout = require('./routes/cart').checkout;

//const products = require('./dbs/products').products;
server.use(parser.json());
server.use(cors());
server.get('/status',(rq,rs)=>{
    //rs.setHeader('content-type','application/json');
    rs.end(JSON.stringify({
        //products : products
        message : "working"
    }));
});
/*server.get('/search',(req,res)=>{
    res.setHeader('content-type','application/json');
     
   
    res.end(
        JSON.stringify({
            search : products
        }));
    
    });*/

//server.use('/search',search);
server.use('/products',user);
server.use('/add',checkout);
server.listen(4455,()=>{
    
    console.log('Server started at 4455');
});

