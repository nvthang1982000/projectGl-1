import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class UserServiceService {
  deleteUserInfo(pid: number) {
    return this.http.get("api link here");
  }
  updateUserInfo(user: { id: number; userfullname: string; contact: number; gender: string; address: string; city: string; state: string; }) {
    return this.http.get("api link here");
  }
  storeUser(value: any) {
    return this.http.get("api link here");

  }
  getAllUsers() {
    return this.http.get("api link here");

  }

  constructor(private http:HttpClient) { }
}
