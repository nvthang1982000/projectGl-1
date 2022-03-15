import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from './user.service';

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
  userName: new FormControl("",[Validators.required,Validators.minLength(6)]),
  userAddress:new FormControl("",[Validators.required,Validators.minLength(6)]),
  useremail : new FormControl("",[Validators.required,Validators.pattern("\[a-z]+[0-9]+@gmail.com")]),
  userphone : new FormControl("",[Validators.required,Validators.minLength(10),Validators.maxLength(10)]),
  img : new FormControl("",[Validators.required]),
  token: new FormControl("",[Validators.required]),
  userpw : new FormControl("",[Validators.required,Validators.minLength(6)]),
  userun : new FormControl("",[Validators.required])
  })
  user: any;

  constructor(public service:UserService, public router: Router) { }

  ngOnInit(): void {
  }

  userLogin(): void{
    this.user.userSignUp(this.UserRegisterReference.value).subscribe((result: string)=>this.RegUser=result,(err: any)=>console.log(err),()=>console.log("Register User"));
    this.UserRegisterReference.reset();
  }

}