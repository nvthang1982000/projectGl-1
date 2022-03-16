import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-homepage',
  templateUrl: './user-homepage.component.html',
  styleUrls: ['./user-homepage.component.css']
})
export class UserHomepageComponent implements OnInit {

  constructor(public route:Router,) { }
  username: any;
  ngOnInit(): void {
  }
  addToCart()
  {}
  userlogout()
  {}
}
