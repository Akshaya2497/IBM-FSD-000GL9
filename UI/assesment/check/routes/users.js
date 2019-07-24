const router = require('express').Router();
const searchItems = require('../services/search').searchItems;
const service = new searchItems();
// status api
router.get('/',(rq,rs)=>{
   // rs.setHeader('content-type','application/json');
    rs.end(JSON.stringify({
        search : service.getAll()
    }))
});

module.exports.user = router;