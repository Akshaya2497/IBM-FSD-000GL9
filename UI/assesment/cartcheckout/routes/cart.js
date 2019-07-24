const router = require('express').Router();
const cart = require('../services/cart.services').cart;
const service = new cart();
// status api
router.get('/',(rq,rs)=>{
   // rs.setHeader('content-type','application/json');
    rs.end(JSON.stringify({
        add : service.createCart()
    }))
});

module.exports.checkout = router;