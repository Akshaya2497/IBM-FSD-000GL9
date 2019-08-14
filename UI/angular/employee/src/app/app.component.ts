import { Component } from '@angular/core';
import { users } from './structures/structure';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'employee';
  detailsFromUser:users;
  showUser($event){
      this.detailsFromUser = $event;
    }
  }

