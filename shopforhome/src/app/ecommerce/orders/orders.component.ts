<<<<<<< HEAD
import { Component, OnInit } from '@angular/core';
=======
import {Component, OnInit} from '@angular/core';
>>>>>>> 9699c45ba73f0399eb3c8afd4ae7c53e674b3b9c
import { Router } from '@angular/router';

import {Subscription} from "rxjs/internal/Subscription";
import { EcommerceService } from 'src/app/ecommerce-service.service';
import { ProductOrders } from 'src/app/product-orders';


@Component({
    selector: 'app-orders',
    templateUrl: './orders.component.html',
    styleUrls: ['./orders.component.css']
})
export class OrdersComponent implements OnInit {
<<<<<<< HEAD
  orders: ProductOrders;
=======
    orders: ProductOrders;
>>>>>>> 9699c45ba73f0399eb3c8afd4ae7c53e674b3b9c
    total!: number ;
    paid!: boolean;
    sub!: Subscription;
    username:string="";

<<<<<<< HEAD

  constructor(private ecommerceService: EcommerceService,public route:Router) {
    this.orders = this.ecommerceService.ProductOrders;
   }

  ngOnInit() {
    this.paid = false;
    this.sub = this.ecommerceService.OrdersChanged.subscribe(() => {
        this.orders = this.ecommerceService.ProductOrders;
    });
    this.loadTotal();
    let res = sessionStorage.getItem("username");
    if(res!=null){
      this.username=res;
    }
}

pay() {
    this.paid = true;
    this.ecommerceService.saveOrder(this.orders).subscribe();
}

loadTotal() {
    this.sub = this.ecommerceService.TotalChanged.subscribe(() => {
        this.total = this.ecommerceService.Total;
    });
}

userlogout(){
    sessionStorage.removeItem("usname");
   this.route.navigate(["useractivity"])
  }

  home(){
    this.route.navigate(["userhome"])
  }
}

}
=======
    constructor(private ecommerceService: EcommerceService,public route:Router) {
        this.orders = this.ecommerceService.ProductOrders;
    }

    ngOnInit() {
        this.paid = false;
        this.sub = this.ecommerceService.OrdersChanged.subscribe(() => {
            this.orders = this.ecommerceService.ProductOrders;
        });
        this.loadTotal();
        let res = sessionStorage.getItem("usname");
        if(res!=null){
          this.username=res;
        }
    }

    pay() {
        this.paid = true;
        this.ecommerceService.saveOrder(this.orders).subscribe();
    }

    loadTotal() {
        this.sub = this.ecommerceService.TotalChanged.subscribe(() => {
            this.total = this.ecommerceService.Total;
        });
    }

    userlogout(){
        sessionStorage.removeItem("usname");
       this.route.navigate(["useractivity"])
      }

      home(){
        this.route.navigate(["userhome"])
      }
}
>>>>>>> 9699c45ba73f0399eb3c8afd4ae7c53e674b3b9c
