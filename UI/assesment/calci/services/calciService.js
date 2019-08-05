//const data = require('../db/history').data;

class calciServ{
        
        _calculate(request){
            let i=0;
            let j=0;
            let result=0;
            let numserv=request.num;
            let opserv=request.ops;
            for(i in opserv){
                if(opserv[i]=='+'){
                   result+=numserv[j]+numserv[j+1];
                   numserv[j+1]=result;
                   j+=2;
                   
                }
                else if(opserv[i]=='-'){
                    result-=numserv[j]-numserv[j+1];
                    numserv[j+1]=result;
                    j+=2;
                 }
            }
            request.res=result;
            return request;
         }
}
module.exports = {
    calciServ
}