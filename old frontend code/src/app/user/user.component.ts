import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { FormService } from '../form.service';
import { UserService } from './user-homepage/user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  RegUser:string="";
  LogUser:string="";

  UserLogRef = new FormGroup({
    useremail : new FormControl("",[Validators.required,Validators.pattern("\[a-z]+[0-9]+@gmail.com")]),
    password : new FormControl("",[Validators.required,Validators.minLength(6)])
  })


    UserRegRef = new FormGroup({
      userfullname: new FormControl("",[Validators.required,Validators.minLength(6)]),
      useremail:new FormControl("",[Validators.required,Validators.pattern("\[a-z]+[0-9]+@gmail.com")]),
       password:new FormControl("",[Validators.required,Validators.minLength(6)]),
      contact:new FormControl("",[Validators.required,Validators.minLength(10),Validators.maxLength(10)]),
      gender: new FormControl("",[Validators.required]),
      address:new FormControl("",[Validators.required]),
      city: new FormControl("",[Validators.required]),
      state:new FormControl("",[Validators.required])

  
  })

  constructor(public usSer:UserService, public route:Router,public fb :FormService) { }
  username: any;
  ngOnInit(): void {
  }

  userLogin(): void{
   // this.usSer.userSignUp(this.UserRegRef.value).subscribe((res:any)=>this.RegUser=res, (err: any)=>console.log(err),()=>console.log("Register User"));
    this.UserRegRef.reset();
  }
  userRegister():void{

  }
}