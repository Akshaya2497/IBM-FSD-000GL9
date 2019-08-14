import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserformRoutingModule } from './userform/userform-routing.module';
import { UserformModule } from './userform/userform.module';

const routes: Routes = [];

@NgModule({
  imports: [RouterModule.forRoot(routes),
          //UserformModule,
          UserformRoutingModule
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
