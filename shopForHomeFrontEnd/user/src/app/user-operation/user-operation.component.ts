import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
// import { UserService } from './user.service';
import { UserServiceService } from '../service/user-service/user-service.service';

import { FormService } from '../service/form/form.service';


@Component({
  selector: 'app-user-operation',
  templateUrl: './user-operation.component.html',
  styleUrls: ['./user-operation.component.css']
})
export class UserOperationComponent implements OnInit {
  RegUser:string="";
  LogUser:string="";

  UserLogRef = new FormGroup({
    useremail : new FormControl("",[Validators.required,Validators.pattern("\[a-z]+[0-9]+@gmail.com")]),
    password : new FormControl("",[Validators.required,Validators.minLength(6)])
  })

  UserRegRef = new FormGroup({

  userName: new FormControl("",[Validators.required,Validators.minLength(6)]),
  userAddress:new FormControl("",[Validators.required,Validators.minLength(6)]),
  useremail : new FormControl("",[Validators.required,Validators.pattern("\[a-z]+[0-9]+@gmail.com")]),
  userphone : new FormControl("",[Validators.required,Validators.minLength(10),Validators.maxLength(10)]),
  img : new FormControl("",[Validators.required]),
  token: new FormControl("",[Validators.required]),
  userpw : new FormControl("",[Validators.required,Validators.minLength(6)]),
  userun : new FormControl("",[Validators.required])
  })

  constructor(public usSer:UserServiceService, public route:Router,public fb :FormService) { }
  username;
  ngOnInit(): void {
  }

  userLogin(): void{
   // this.usSer.userSignUp(this.UserRegRef.value).subscribe((res:any)=>this.RegUser=res, (err: any)=>console.log(err),()=>console.log("Register User"));
    this.UserRegRef.reset();
  }
  userRegister():void{

  }
}

 