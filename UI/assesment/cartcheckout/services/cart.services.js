let table=`<table>
    <tr><th>Product</th>
    <th>Quantity</th>
    <th>Price</th></tr>`
class cart{
    constructor(){
        this.cart=cart;
    }      
 createCart(){
    let counter=0;
    let category = document.getElementById("sCategory").value;
    let name = document.getElementById("sName").value;
    let rows='';
    let price;
    quant.find((q)=>{
            price= q.price;
            return name == q.name;
     });
    table += `<tr><td>${name}</th>
        <td> <input type="text" id="quan" value=1>
        <input type="button" id="button" value='+' onclick="inc()">
        <input type="button" value='-' onclick=dec()></td>
         <td>${price}</td></tr>
        </table>`;
document.getElementById("table").innerHTML=table;
}
 inc(){
    let c=document.getElementById("quan").value;
    console.log(c);
    c++;
    console.log(c);
    document.getElementById("quan").value=c;
    
}
 dec(){
    let c=document.getElementById("quan").value;
    console.log(c);
    c--;
    console.log(c);
    document.getElementById("quan").value=c;
    
}
}
module.exports = {
    cart
}