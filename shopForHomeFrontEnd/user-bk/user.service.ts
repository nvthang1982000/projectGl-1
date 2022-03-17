import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { UserEntity } from './user-entity';
import { Observable} from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(public http:HttpClient) { }