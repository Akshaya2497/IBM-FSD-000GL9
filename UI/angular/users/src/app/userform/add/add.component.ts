import { Component, OnInit, Output } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { users } from 'src/app/structures/structure';
import { EventEmitter } from 'events';
@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  userdetails: users[]
  constructor(private route:ActivatedRoute,private router:Router) { }
  @Output() _userDetails = new EventEmitter();
  ngOnInit() {
     
    // setup
    this.userdetails=[{
      email:"abc@mail.com",
      password:'1234a'
    }];
    this._userDetails.emit(this.userdetails);
  }
  _register(data){
   /* this.userdetails.email=data.email;
    this.userdetails.password=data.password*/
    this.userdetails.push({ 
      email: data.email,
      password : data.password
    }
      );
    console.log(this.userdetails);
  }
}


