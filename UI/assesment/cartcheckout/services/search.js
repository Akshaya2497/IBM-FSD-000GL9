const products = require('../dbs/products').products;

class searchItems{
    constructor(){
            
            this.products = products
        }
       
        getAll(){
            return this.products;
        }
        
        
    }

module.exports = {
    searchItems
}