import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { users } from 'src/app/structures/structure';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  constructor(private route:ActivatedRoute,private router:Router) { }

  ngOnInit() {

  }
  userdetails:users[];

  getDetails($event){
    this.userdetails = $event;
  }
}
