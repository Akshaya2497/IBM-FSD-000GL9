import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserformComponent } from './userform/userform.component';
import { UserformModule } from './userform/userform.module';
import { TopmenuComponent } from './topmenu/topmenu.component';
import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AddComponent } from './userform/add/add.component';
import { ListComponent } from './userform/list/list.component';
import { DeleteComponent } from './userform/delete/delete.component';
import { FormsModule} from '@angular/forms';
import { UserformRoutingModule } from './userform/userform-routing.module';
import { StructuresComponent } from './structures/structures.component';
@NgModule({
  declarations: [
    AppComponent,
    UserformComponent,
    TopmenuComponent,
    HomeComponent,
    AboutusComponent,
    AddComponent,
    DeleteComponent,
    ListComponent,
    StructuresComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,    
    //UserformModule,
    UserformRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
