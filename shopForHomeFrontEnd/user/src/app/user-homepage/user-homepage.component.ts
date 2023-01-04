import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserServiceService } from '../service/user-service/user-service.service';

@Component({
  selector: 'app-user-homepage',
  templateUrl: './user-homepage.component.html',
  styleUrls: ['./user-homepage.component.css']
})
export class UserHomepageComponent implements OnInit {
  products: any;
  selectedProdecuts = JSON.parse(localStorage.getItem('products') || "[]");
  constructor(public route: Router, private userService: UserServiceService) { }
  username: any;
  soryBy: any = '';
  category: any = '';

  ngOnInit(): void {
    this.userService.get('https://fakestoreapi.com/products').subscribe(res => {
      this.products = res;
    })
  }
  addToCart(product: any) {
    this.selectedProdecuts.push(product);
    localStorage.setItem('products', JSON.stringify(this.selectedProdecuts));
  }
  userlogout() { }

  sorting() {
    if (this.soryBy == 'high') {
      this.products.sort((a: any, b: any) => b.price - a.price);
    } else {
      this.products.sort((a: any, b: any) => a.price - b.price);
    }
  }
  categories(){
    this.userService.get('https://fakestoreapi.com/products/category/'+this.category).subscribe(res => {
      this.products = res;
    })
  }
}
