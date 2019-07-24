const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');
const userRoutes = require('./apis/users').userRoutes;
const cartRoutes = require('./apis/cart').cartRoutes;
const setContentHeader = require('./services/utils').setContentHeader;
server.use(parser.json());
server.use(cors());
server.get('/status',(req,res)=>{
    setContentHeader(res);
    res.end(JSON.stringify({
        message: "Server is RUNNING successfully"
    }));
});
server.use('/product',userRoutes);
server.use('/cart',cartRoutes);
server.listen(1234,()=>{
    console.log('Server started at 1234');
});
