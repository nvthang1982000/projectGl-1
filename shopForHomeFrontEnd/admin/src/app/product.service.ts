import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './products';
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(public http:HttpClient) { }

  getAllProducts():Observable<Product[]>{
    return this.http.get<Product[]>("http://localhost:8181/ProductCRUDS/getallprod");
  }
  storeProductInfo(prod:Product):Observable<string>{
      return this.http.post("http://localhost:8181/ProductCRUDS/storeprod",prod,{responseType:'text'});
  }

  deleteProductInfo(pid:number):Observable<string>{
    return this.http.delete("http://localhost:8181/ProductCRUDS/deleteprod/"+pid,{responseType:'text'});
  }

  updateProductInfo(prod:any):Observable<string>{
    return this.http.put("http://localhost:8181/ProductCRUDS/updateprod",prod,{responseType:'text'});
  }


}




