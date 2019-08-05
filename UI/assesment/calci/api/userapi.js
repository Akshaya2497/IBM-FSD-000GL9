const router = require('express').Router();
const userService = require('../services/user.service.js').userService;
const service = new userService();
router.post('/token',(req,res)=>{
    res.setHeader('content-type','application/json')
    console.log(req.body.name);
    const userExist = service.isUser(req.body.name,req.body.pass);
    console.log(userExist);
    if(userExist){
        const token = service.generateToken(userExist);
        res.status(200).json({
            message : "Token generated",
            token : token
        });
        
    }
    else{
        res.status(200).json({
            message : "invalid user credentials",
        });
    }
});
router.get('/login',(req,res)=>{
    res.end(JSON.stringify({
        message : "Login Successfull"
    }))
});
module.exports.user=router;