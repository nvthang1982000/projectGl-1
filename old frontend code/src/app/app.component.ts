import { Component } from '@angular/core';

import { Router } from '@angular/router';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'shopforhome';
  flag:boolean=true;
  inbound:boolean=true;
  constructor(public route:Router){}

  ChangeNav():void{
    this.flag = false;
    this.route.navigate(["useractivity"]);

  }
  ChangeNavAd():void{
    this.flag = false;
    this.route.navigate(["adminactivity"]);

  }
}


