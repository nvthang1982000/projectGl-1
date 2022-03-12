import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< HEAD
import { AdminHomepageComponent } from './admin-homepage/admin-homepage.component';
import { EcommerceComponent } from './ecommerce/ecommerce.component';
import { OrdersComponent } from './ecommerce/orders/orders.component';
import { ProductsComponent } from './ecommerce/products/products.component';
import { ProductsshoppingCartComponent } from './ecommerce/productsshopping-cart/productsshopping-cart.component';
import { ShoppingCartComponent } from './ecommerce/shopping-cart/shopping-cart.component';
import { AdminOperationComponent } from './admin-operation/admin-operation.component';
import { SearchComponent } from './search/search.component';
import { StockReportComponent } from './stock-report/stock-report.component';
=======
import { UserComponent } from './user/user.component';
import { UserHomepageComponent } from './user-homepage/user-homepage.component';
>>>>>>> a430fe85719205497ed12fafd6ffc9a0e4c2eafe

@NgModule({
  declarations: [
    AppComponent,
<<<<<<< HEAD
    AdminHomepageComponent,
    EcommerceComponent,
    OrdersComponent,
    ProductsComponent,
    ProductsshoppingCartComponent,
    ShoppingCartComponent,
    AdminOperationComponent,
    SearchComponent,
    StockReportComponent
=======
    UserComponent,
    UserHomepageComponent
>>>>>>> a430fe85719205497ed12fafd6ffc9a0e4c2eafe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
