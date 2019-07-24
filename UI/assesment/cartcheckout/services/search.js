const products = require('../dbs/products').products;
const jwt = require('jsonwebtoken');
class searchItems{
    constructor(){
        this.products=products;
    }
    searchByCategory(){
        let rows='<select>';
        products.forEach((prod)=>{
            rows+=`<option>${prod.category}</option>`;
        });
        rows+='</select>';
        console.log(rows);
        return rows;
    }
    searchByName(){
        let rows='<select>';
        products.forEach((prod)=>{
            rows+=`<option>${prod.name}</option>`;
        });
        rows+='</select>';
        console.log(rows);
        return rows;
        
    }
}
module.exports = {
    searchItems
}