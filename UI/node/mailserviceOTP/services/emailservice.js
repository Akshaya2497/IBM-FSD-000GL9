const nodemailer = require('nodemailer');
const UserConstants = require('./util.service').UserConstants;
class Email {
    constructor(){
        this.smtpSetup = {
            service : UserConstants.smtp.provider,
            auth :{
                user : UserConstants.smtp.address,
                pass : UserConstants.smtp.password
            }
        }
        // configure the smtp settings
        this.mailer = nodemailer.createTransport(this.smtpSetup);
    }
    email(userObj){
        // in case sender isnt mentioned
        if(userObj.from == null){
            userObj.from = UserConstants.smtp.address;
        }
        this.mailer.sendMail({
            from : userObj.from,
            to : userObj.to,
            subject : userObj.subject,
            /*text : emailBody, */
            html : userObj.body
        },(err,response)=>{
            if(err){
                console.log(err);
                return "Unable to send email";
            }else{
                console.log('Email Sent');
                return "Email Sent Successfully";
            }
        })
    }
    emailWithAttachment(userObj){
        // in case sender isnt mentioned
        if(userObj.from == null){
            userObj.from = UserConstants.smtp.address;
        }
        this.mailer.sendMail({
            from : userObj.from,
            to : userObj.to,
            subject : userObj.subject,
            /*text : emailBody, */
            html : userObj.body,
            attachments: [
                {
                    filename : 'hello.txt',
                    path : __dirname +'/' +'abc.txt'
                    /*,content: 'Hello how r u' */
                }
            ] 
        },(err,response)=>{
            if(err){
                console.log(err);
                return "Unable to send email";
            }else{
                console.log('Email Sent');
                return "Email Sent Successfully";
            }
        })
    }
}
module.exports.Email = Email;