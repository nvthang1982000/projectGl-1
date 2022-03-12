import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Userservice } from '../user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  RegUser:string="";
  LogUser:string="";

  UserLoginReference = new FormGroup({
    useremail : new FormControl("",[Validators.required,Validators.pattern("\[a-z]+[0-9]+@gmail.com")]),
    password : new FormControl("",[Validators.required,Validators.minLength(6)])
  })

  UserRegisterReference = new FormGroup({
  username: new FormControl("",[Validators.required,Validators.minLength(6)]),
  useremail:new FormControl("",[Validators.required,Validators.pattern("\[a-z]+[0-9]+@gmail.com")]),
  password : new FormControl("",[Validators.required,Validators.minLength(6)]),
  contact : new FormControl("",[Validators.required,Validators.minLength(10),Validators.maxLength(10)]),
  gender : new FormControl("",[Validators.required]),
  address : new FormControl("",[Validators.required]),
  city : new FormControl("",[Validators.required]),
  state : new FormControl("",[Validators.required])
  })

  constructor(public user:UserService,public route:Router) { }

  ngOnInit(): void {
  }

  userLogin(): void{
    this.user.userSignUp(this.UserRegisterReference.value).subscribe(result=>this.RegUser=result,err=>console.log(err),()=>console.log("Register User"));
    this.UserRegisterReference.reset();
  }

}
