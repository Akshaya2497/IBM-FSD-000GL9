const user = require('../db/users').user;
const jwt =  require('jsonwebtoken');
const key = require('../keys/key').privateKey;
class userService{
    constructor(){
        this.user=user;
    }
    isUser(name,pass){
        console.log(name,pass);
        return this.user.find((u)=>{
            return u.name == name && u.pass == pass;
        });
    }
    generateToken(user){
        const data = {
            name : user.name
            
        }
        const token = jwt.sign(data,key,{
            expiresIn : "1m"
        });
        return token;
    }
        
}
module.exports = {
    userService
}
