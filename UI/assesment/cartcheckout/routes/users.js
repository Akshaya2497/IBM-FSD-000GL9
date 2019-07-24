const router = require('express').Router();
const Service = require('../services/search').searchItems;
const service = new Service();
// status api
router.get('/',(rq,rs)=>{
    rs.setHeader('content-type','application/json');
    rs.end(JSON.stringify({
        search : service.getAll()
    }))
});

module.exports.user = router;