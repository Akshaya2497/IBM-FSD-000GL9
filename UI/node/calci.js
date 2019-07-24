const calci = require('./calcinode');
const _obj = new calci.Calculator();
console.log(_obj._add(5,4));
let first = parseInt(process.argv[2]);
let sec = parseInt(process.argv[3]) ;
console.log(_obj._add(first,sec));
console.log(_obj._sub(first,sec));
