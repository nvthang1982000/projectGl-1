import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Product } from '../product';
import { ProductService } from '../product.service';
import { UserEntity } from '../user-entity';
import { UserService } from '../user.service';

@Component({
  selector: 'app-admin-homepage',
  templateUrl: './admin-homepage.component.html',
  styleUrls: ['./admin-homepage.component.css']
})
export class AdminHomepageComponent implements OnInit {
  adminname:string="";
  retrieveUsers:Array<UserEntity>=[];
  products:Array<Product>=[];
  storeUs:string="";
  storeMsg:string="";
  deleteMsg:string="";
  updateMsg:string="";
  deleteUs:string="";
  updateUs:string="";
  flag:boolean=false;
  uid:number=0;
  userfullname:string="";
  contact:number=0;
  gender:string="";
  address:string="";
  city:string="";
  state:string="";
  stocks:number=0;
  fl:boolean=false;
  pid:number=0;
  price:number=0;
  pname:string="";
  pdesc:string="";
  pimage:string="";
  constructor(public route:Router,public UsServ:UserService,public prodSer:ProductService) { }

  ngOnInit(): void {
    let res = sessionStorage.getItem("adname");
    if(res!=null){
      this.adminname=res;
    }
    this.getUsers();
    this.loadProducts();
  }
  
 adminlogout(){
   sessionStorage.removeItem("adname");
  this.route.navigate(["adminactivity"])
 }

 stockreport():void{
   this.route.navigate(["stockreport"])
 }
 getUsers(): void{
  this.UsServ.getAllUsers().subscribe(res=>this.retrieveUsers=res);
}

storeUser(UserRef:NgForm){
  
  this.UsServ.storeUser(UserRef.value).subscribe(res=>this.storeUs=res,error=>console.log(error),()=>this.getUsers());  
  UserRef.reset();
}
deleteUser(pid:number){
  
  this.UsServ.deleteUserInfo(pid).
  subscribe(res=>this.deleteUs=res,error=>console.log(error),()=>this.getUsers());
}

updateUser(user:UserEntity){
 
  this.flag=true;
  this.uid=user.id;
  this.userfullname=user.userfullname;
  this.gender=user.gender;
  this.contact=user.contact;
  this.address=user.address;
  this.city = user.city;
  this.state=user.state;
}

updateUserDetails() {
  let user ={"id":this.uid,"userfullname":this.userfullname,"contact":this.contact,"gender":this.gender,"address":this.address,"city":this.city,"state":this.state}
  this.UsServ.updateUserInfo(user).subscribe(result=>this.updateUs=result,
  error=>console.log(error),
  ()=>{
  this.getUsers();
  this.flag=false;  
  })
}

loadProducts(): void{
  
  this.prodSer.getAllProducts().subscribe(res=>this.products=res);
}

storeProduct(productRef:NgForm){
  this.prodSer.storeProductInfo(productRef.value).
  subscribe(res=>this.storeMsg=res,error=>console.log(error),()=>this.loadProducts());  
  productRef.reset();
}

deleteProduct(pid:number){
  //console.log(pid);
  this.prodSer.deleteProductInfo(pid).
  subscribe(res=>this.deleteMsg=res,error=>console.log(error),()=>this.loadProducts())
}

updateProduct(product:Product){
  //console.log(product);
  this.fl=true;
  this.pid=product.pid;
  this.pname=product.pname;
  this.price=product.price;
  this.pdesc=product.pdesc;
  this.pimage=product.pimage;
  this.stocks = product.stocks;
}

updateProductDetails() {
  let product ={"pid":this.pid,"price":this.price,"pname":this.pname,"pimage":this.pimage,"pdesc":this.pdesc,"stocks":this.stocks}
  
  this.prodSer.updateProductInfo(product).subscribe(result=>this.updateMsg=result,
  error=>console.log(error),
  ()=>{
  this.loadProducts();
  this.fl=false;  
  })
}

}
