import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../product';
import { ProductService } from '../product.service';


@Component({
  selector: 'app-stock-report',
  templateUrl: './stock-report.component.html',
  styleUrls: ['./stock-report.component.css']
})
export class StockReportComponent implements OnInit {
  products:Array<Product> =[];

  constructor(public route:Router,public prodSer:ProductService) { }

  ngOnInit(): void {
    this.getAllproducts();
  }

  getAllproducts():void{
    this.prodSer.getAllProducts().subscribe(res=>this.products=res);
  }

  backtoadminhome():void{
    this.route.navigate(["adminhome"])
  }
}

