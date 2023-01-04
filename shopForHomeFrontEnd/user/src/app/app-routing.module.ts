import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddToCartComponent } from './service/add-to-cart/add-to-cart.component';
import { UserHomepageComponent } from './user-homepage/user-homepage.component';

const routes: Routes = [
  {path:'home', component:UserHomepageComponent},
  {path:'add-to-cart', component:AddToCartComponent},
  {path:'', redirectTo:'/home', pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
