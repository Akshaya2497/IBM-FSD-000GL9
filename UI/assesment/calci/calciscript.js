var nums=[];
let op=[];
let i=0;
const login=()=>{
    const _name = document.getElementById("name").value;
    const _pass = document.getElementById("pass").value;
    const url = 'http://localhost:1234/user/token';            
    fetch(url,{
        method : 'POST',
        headers : {
            'content-type': 'application/json'
        },                
        body:JSON.stringify({
            name : _name,
            pass : _pass
        })
    })
    .then(response=>response.json())
    .then(data=>{
       alert(data.message,data.token);
    }); 
}
const appendNum=(val)=>{
    let variable = JSON.stringify(val);
    setNum(variable);
}
const setNum=(val)=>{
    document.getElementById("input").value+=val;
}
const clear=()=>{
    document.getElementById("input").value="";
}
const savenum=(operator)=>{
    nums[i]=parseInt(document.getElementById("input").value);
    op[i]=operator;
    console.log(nums[i],op[i]);
    clear();
    i++;
}
const equals = () =>{
    savenum('=');
    //console.log(nums);
    i=0;
    const url = 'http://localhost:1234/calci';            
    fetch(url,{
        method : 'POST',
        headers : {
            'content-type': 'application/json'
        },                
        body:JSON.stringify({
            num : nums,
            ops : op,
            res : 0
        })
    })
    .then(response=>response.json())
    .then(data=>{
        document.getElementById("input").value=data.res;
    }); 
}
                   
