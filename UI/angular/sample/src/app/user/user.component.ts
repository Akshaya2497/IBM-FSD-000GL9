import { Component, OnInit, Input, Output } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  message:string
  users:string[]
  emps:Emp[]
  @Input() mess:string
  @Output() _empDetails = new EventEmitter(); 
  constructor() { }

  ngOnInit() {
    this.message="This is a new user component"
    this.users=["akki","steve","scarlet"]
    this.emps =[
      {
        id: 1,
        name: 'John',
        dob: new Date()
      },
      {
        id: 2,
        name: 'Martin',
        dob: new Date()
      },
      {
        id: 3,
        name: 'Bob',
        dob: new Date()
      }
    ]
  }
  clickMe(){
    const dt = new Date();
    //dt.getMilliseconds();
    dt.setFullYear(2018);
    dt.setDate(11);
    dt.setMonth(0);

    this.emps.push({
      id: 4,
      name: 'Zack',
      dob: dt
    });
    // send data to App Component
    this._empDetails.emit(this.emps[0]);
  }

}
export interface Emp {
  id:number
  name:string
  dob:Date
}
