import { Component, OnInit,Output } from '@angular/core';
import { users } from '../structures/structure';
import { EventEmitter } from 'events';
import { UserserviceService } from '../userservice.service';
@Component({
  selector: 'app-userdetails',
  templateUrl: './userdetails.component.html',
  styleUrls: ['./userdetails.component.css']
})

export class UserdetailsComponent implements OnInit {
  user:users[];
  constructor(private uService: UserserviceService) { } 
  @Output() showUser = new EventEmitter();
 
  ngOnInit() { 
    
    this.user = this.uService.getUsers();
      
  }
  deleteUser(id){
    this.user = this.uService.delUser(id);
  }
  addUser(){
    this.user = this.uService._addUser();
  }  
}


