import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminHomepageComponent } from './admin-homepage/admin-homepage.component';
import { AdminOperationComponent } from './admin-operation/admin-operation.component';
import { EcommerceComponent } from './ecommerce/ecommerce.component';
import { StockReportComponent } from './stock-report/stock-report.component';

const routes: Routes = [
  {path:"adminactivity",component:AdminOperationComponent},
  {path:"adminhome",component:AdminHomepageComponent},
  {path:'ecommerce',component:EcommerceComponent},
  {path:"stockreport",component:StockReportComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]

})
export class AppRoutingModule { }
