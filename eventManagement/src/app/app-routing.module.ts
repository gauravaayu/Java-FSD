import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { CrudOperationComponent } from './crud-operation/crud-operation.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {path:'',redirectTo:'login',pathMatch:'full'},
  {path:'login',component:LoginComponent},
  
{path:'ManageUser',component:CrudOperationComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
