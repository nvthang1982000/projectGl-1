import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { AdminHomepageComponent } from './admin-homepage/admin-homepage.component';
import { EcommerceComponent } from './ecommerce/ecommerce.component';
import { OrdersComponent } from './ecommerce/orders/orders.component';
import { ProductsComponent } from './ecommerce/products/products.component';

import { ShoppingCartComponent } from './ecommerce/shopping-cart/shopping-cart.component';
import { AdminOperationComponent } from './admin-operation/admin-operation.component';
import { SearchComponent } from './search/search.component';
import { StockReportComponent } from './stock-report/stock-report.component';
import { UserComponent } from './user/user.component';
import { UserHomepageComponent } from './user/user-homepage/user-homepage.component';
import { FileUploadComponent } from './file-upload/file-upload.component';
import { SearchFilterPipe } from './stock-report/SearchPipes/search-filter.pipe';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    AppComponent,
    AdminHomepageComponent,
    EcommerceComponent,
    OrdersComponent,
    ProductsComponent,
    
    ShoppingCartComponent,
    AdminOperationComponent,
    SearchComponent,
    StockReportComponent,
    UserComponent,
    UserHomepageComponent,
    FileUploadComponent,
    SearchFilterPipe

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,ReactiveFormsModule,FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
