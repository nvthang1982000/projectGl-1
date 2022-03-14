import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { AdminHomepageComponent } from './admin-homepage/admin-homepage.component';
import { EcommerceComponent } from './ecommerce/ecommerce.component';
import { OrdersComponent } from './ecommerce/orders/orders.component';
import { ProductsComponent } from './ecommerce/products/products.component';
<<<<<<< HEAD

=======
//import { ProductsshoppingCartComponent } from './ecommerce/productsshopping-cart/productsshopping-cart.component';
>>>>>>> 9699c45ba73f0399eb3c8afd4ae7c53e674b3b9c
import { ShoppingCartComponent } from './ecommerce/shopping-cart/shopping-cart.component';
import { AdminOperationComponent } from './admin-operation/admin-operation.component';
import { SearchComponent } from './search/search.component';
import { StockReportComponent } from './stock-report/stock-report.component;
import { UserComponent } from './user/user.component';
import { UserHomepageComponent } from './user-homepage/user-homepage.component';


@NgModule({
  declarations: [
    AppComponent,
<<<<<<< HEAD
    AdminHomepageComponent,
    EcommerceComponent,
    OrdersComponent,
    ProductsComponent,
    
    ShoppingCartComponent,
    AdminOperationComponent,
    SearchComponent,
    StockReportComponent
=======
    UserComponent,
    UserHomepageComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
