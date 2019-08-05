const client = require('mongodb').MongoClient;
const UserConstants = require('./util.service').UserConstants;
const bcrypt = require('bcrypt');
const Email = require('./emailservice').Email;
const emailService = new Email();
let _otp = "";
let _time;
class Service {
    // verify user
    fetchUser(_user,_pass,callback){
        const hashPassword = this.generateHash(_pass);
        const _url = UserConstants.mongo.url + UserConstants.mongo.port;
        client.connect(_url,(err,connection)=>{
            connection.db(UserConstants.mongo.db).collection(UserConstants.mongo.collections.user).find({email: _user, password: hashPassword }).toArray((err,response)=>{
                callback(err,response);
            });
        });
    } 
    // generate hash
    generateHash(_pass){
        return bcrypt.hashSync(_pass,UserConstants.jwt.salt);
    }
    addUser(_user,callback){
        _user.otp = this.generateOTP();
        console.log(_user.otp);
        _user.timeToLive = this.timeTL();
        console.log(_user.timeToLive);
        const _url = UserConstants.mongo.url + UserConstants.mongo.port;
        client.connect(_url,{ useNewUrlParser: true },(err,connection)=>{
            connection.db(UserConstants.mongo.db).collection(UserConstants.mongo.collections.user).insertOne(_user,(err,response)=>{
               if(!err){                

                this.email(_user);
               }
                callback(err,response);
            });
        });
    }
    generateOTP(){
        _otp = '';
        let ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        let chLen = ch.length;
        for(let i=0; i<8;i++){
            _otp += ch.charAt(Math.floor(Math.random() * chLen));
        }
        console.log(`otp : ${_otp}`);
        return _otp;

    }
    timeTL(){
        let _ttl = new Date();
        _ttl.setMinutes(_ttl.getMinutes()+5);
          
        _time = new Date(_ttl);
        return _time.getTime();
    }
    
    updateUser(_user,callback){
        let isValidOTP = this.checkotp(_user.otp);
        let starttime = new Date().getTime();
        console.log(starttime); 
        let isValidTime = this.checkttl(starttime);
        if(isValidOTP && isValidTime){        
        // update password
            _user.password = this.generateHash(_user.password);
            const _url = UserConstants.mongo.url + UserConstants.mongo.port;
            client.connect(_url,{ useNewUrlParser: true },(err,connection)=>{
                connection.db(UserConstants.mongo.db)
                .collection(UserConstants.mongo.collections.user)
                .update(
                    {otp : _user.otp},
                    {$set : { password : _user.password}},                    
                    (err,response)=>{
                        if(!err){
                            console.log("password changed");
                        }
                        callback(err,response);
                
                });
        });
    }
    } // end of add user
    /*
    "otp" : "FL6ZaJhC",
    "password" : "1234"
    */
    checkotp(otp){
        if(otp == _otp)
        return 1;
        return 0;
    }
    checkttl(starttime){
        if(starttime <= _time.getTime())
        return 1;
        return 0;
    }
    // get all users
    fetchUsers(callback){
        const _url = UserConstants.mongo.url + UserConstants.mongo.port;
        client.connect(_url,(err,connection)=>{
            connection
            .db(UserConstants.mongo.db)
            .collection(UserConstants.mongo.collections.user)
            .find()
            .toArray((err,response)=>{
                callback(error,response);
            });
        });
    } // end of fetch user
    email(user,otp){
        let userObj ={
            subject : "User Registration",
            body : `<div>Dear <b>${user.email}</b><br/>
                    Your OTP is <b>${user.otp}</b>
                    </div>
                    <div>Thank you for registering</div>`,
            from : null,
            to : user.email
        }
        emailService.email(userObj);
    }
}

module.exports={
    UserService : Service
}