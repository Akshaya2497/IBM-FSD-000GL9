const products = require('../dbs/products').products;
const jwt = require('jsonwebtoken');

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
    getAllProduct(){
        return this.products;
    }
    
    
}

module.exports.Service = Service