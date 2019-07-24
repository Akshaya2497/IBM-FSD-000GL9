const express=require('express');
const server= express();
const parser= require('body-parser');
server.use(parser.json());
server.get('/calculate/:operand/:num1/:num2',(req,res)=>{
    const op = req.params.operand;
    let resu;
        
        if(op == 'ADD')
            resu = parseInt(req.params.num1) + parseInt(req.params.num2);
        else if(op == 'SUB')
            resu= parseInt(req.params.num1) - parseInt(req.params.num2);
    
    res.end(JSON.stringify({
        result: resu
    }));
});
server.post('/calculate',(req,res)=>{
    res.setHeader('content-type','application/json');
    op = req.body.operand,
    no1 = parseInt(req.body.num1),
    no2 = parseInt(req.body.num2) 
         
            
    res.end(JSON.stringify({
        
       result: no1 + no2
    }))

        
   
});
const port= 1234;
server.listen(port,()=>{
    console.log(`server started at ${port} `);
});