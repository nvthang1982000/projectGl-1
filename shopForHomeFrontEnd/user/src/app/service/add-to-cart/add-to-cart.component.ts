import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-add-to-cart',
  templateUrl: './add-to-cart.component.html',
  styleUrls: ['./add-to-cart.component.css']
})
export class AddToCartComponent implements OnInit {
listOfProdects:any;
  constructor() { }

  ngOnInit(): void {
    this.listOfProdects = JSON.parse(localStorage.getItem('products') || "[]");
    this.listOfProdects = this.listOfProdects.map(function(el:any) {
      var o = Object.assign({}, el);
      o.count = 1;
      return o;
    })
  }
  increment(product:any){
    this.listOfProdects.forEach((o:any) => o.id == product.id && o.count++);
  }
  decrement(product:any){
    if(product.count > 0){
      this.listOfProdects.forEach((o:any) => o.id == product.id && o.count--);
    }
  }
}
