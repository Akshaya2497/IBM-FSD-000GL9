const users = require('../dbs/users').users;
const jwt = require('jsonwebtoken');
const key = require('../keys/private').private_key;
const Email = require('./email.service').Email;
const emailService = new Email();

class Service {
    constructor(){
        this.userTokens = new Map();
        this.users = users
    }
    register(user){
        this.email(user);
        this.users.push(user);
    }
    getAllUsers(){
        return this.users;
    }
    
    
}

module.exports.Service = Service