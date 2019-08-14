import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddComponent } from './add/add.component';
import { DeleteComponent } from './delete/delete.component';
import { ListComponent } from './list/list.component';
import { UserformComponent } from './userform.component';
import { UserformRoutingModule } from './userform-routing.module';




@NgModule({
  declarations: [AddComponent, DeleteComponent, ListComponent, UserformComponent],
  imports: [
    CommonModule,
    UserformRoutingModule
    
  ]
})
export class UserformModule { }
