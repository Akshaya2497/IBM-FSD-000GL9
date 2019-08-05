const router = require('express').Router();
const calciServ = require('../services/calciService').calciServ;
const service = new calciServ();
router.post('/',(req,res)=>{
    res.setHeader('content-type','application/json')
    console.log(req.body);
    res.end(JSON.stringify({
        calculate : service._calculate(req.body)
    }))
});
module.exports.calculate = router;

