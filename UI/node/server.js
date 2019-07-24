const server= require('http');
const http=server.createServer((request,response)=>{
    if(request.url==='/'){
        console.log('welcome to node js ');
    }
    else if(request.url==='/status'){
        console.log('server started');
    }
    else if(request.url==='/user' && port === 'GET'){
        response.setHeader('content-type','application/nodejs');
        response.end(JSON.stringify({
            id:1,
            name:'bob'
        }));
    }
});
const port= parseInt(process.argv[2]);
http.listen(port,()=>{
    console.log(`server started at ${port}`);
});