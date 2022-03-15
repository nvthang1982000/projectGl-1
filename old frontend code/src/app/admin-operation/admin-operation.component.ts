import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators} from '@angular/forms';
import { Router } from '@angular/router';
import { AdminServiceService } from '../admin-service.service';


@Component({
  selector: 'app-admin-operation',
  templateUrl: './admin-operation.component.html',
  styleUrls: ['./admin-operation.component.css']
})
export class AdminOperationComponent implements OnInit {
   Logres:string="";
   Regres:string="";
   LoginRef = new FormGroup({
    email:new FormControl("",[Validators.required,Validators.pattern("\[a-z]+[0-9]+@[a-z]+.com")]),
    password:new FormControl("",[Validators.required,Validators.minLength(6)])
  });
  RegRef = new FormGroup({
    email: new FormControl("",[Validators.required,Validators.pattern("\[a-z]+[0-9]+@[a-z]+.com")]),
    password: new FormControl("",[Validators.required,Validators.minLength(6)]),
    username: new FormControl("",[Validators.required,Validators.minLength(7)])
  });
  constructor(public adServ:AdminServiceService,public route:Router) { }

  ngOnInit(): void {
  }
  adminLogin():void{
    let login = this.LoginRef.value;
     this.adServ.adminSignIn(login).subscribe(res=>{
      if(res.startsWith("Welcome")){
        sessionStorage.setItem("adname",login.email);
        this.route.navigate(["adminhome"]);
      }
      else{
        this.Logres=res;
        this.LoginRef.reset();}
    },err=>console.log(err),()=>console.log("User Login"));
   
     
  }

  adminRegister():void{
    let reg = this.RegRef.value;
    this.adServ.adminSignUp(reg).subscribe(res=>this.Regres=res,err=>console.log(err),()=>console.log("User Register"));
    this.RegRef.reset();
  }
  
}
