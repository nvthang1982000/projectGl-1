import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

interface Productsearch {
  pid:number;
  pname:string,
  pdesc:string,
  pimage:string,
  price:number
}

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  searchTerm!: string;
  productsser!: Productsearch[];
  allProducts!: Productsearch[];


  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    console.log("Hello")
    this.http.get<Productsearch[]>()
      .subscribe((data: Productsearch[]) => {
        this.productsser = data;
        this.allProducts = this.productsser;
      });
  }

  search(value: string): void {
    
    this.productsser = this.allProducts.filter((val) => val.pname.toLowerCase().includes(value));
    
    
  }


}
