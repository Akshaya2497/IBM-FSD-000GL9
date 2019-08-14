import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { ProjectRoutingModule } from './project/project-routing.module';
import { AppComponent } from './app.component';

import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { EditComponent } from './edit/edit.component';
import { UsersComponent } from './users/users.component';
//import { ProjectComponent } from './project/project.component';
import { AddComponent } from './project/add/add.component';
import { ListComponent } from './project/list/list.component';

@NgModule({
  declarations: [
    AppComponent,
   
    HomeComponent,
    AboutusComponent,
    EditComponent,
    UsersComponent,
    
    AddComponent,
    ListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ProjectRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
