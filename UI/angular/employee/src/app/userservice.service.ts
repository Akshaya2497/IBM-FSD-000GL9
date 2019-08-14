
import { Injectable } from '@angular/core';
import { UserdetailsComponent } from './userdetails/userdetails.component';
import { users } from './structures/structure';
@Injectable({
  providedIn: 'root'
})
export class UserserviceService {
  users:users[]
  index: number
  constructor() { }
  _addUser(){
    const dt = new Date();
    //dt.getMilliseconds();
    dt.setFullYear(2018);
    dt.setDate(11);
    dt.setMonth(0);
    this.users.push({
      id: 4,
      name: 'Zack',
      age : 20,
      status:false
    });
    return this.users;
  }
  getUsers(){
    return this.users =[
      {
        id:1,
        name: 'Adams',
        age: 20,
        status:true
      },
      {
        id:2,
        name: 'Steve',
        age: 15,
        status:true
      },
      {
        id:3,
        name: 'Rogers',
        age: 25,
        status:false
      }
    ]
  }
  delUser(id){
    this.users.find((u,i)=>{
      this.index = i
      return u.id == id
    })
    this.users.splice(this.index, 1)
    return this.users
  }
    
  }

