import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { UserClass } from './UserClass';
import {map} from 'rxjs/operators'
import { Router } from '@angular/router';
@Injectable({
  providedIn: 'root'
})
export class ListService {
  url:string="http://localhost:3000/users";



  constructor(private http:HttpClient,private router:Router) { }
  getAllUsers():Observable <UserClass[]>{

    return this.http.get<UserClass[]>(this.url);
    
    }
    UpdateUserDetailing(data:any, id:number)
  {
    return this.http.put<any>("http://localhost:3000/users/" + id,data).pipe(map((res:any)=> {
     
    
      return res
    }))
  }

  // Delete Method For Update Student
  DeleteUserDetails(id:number)
  {
    return this.http.delete<any>("http://localhost:3000/users/" + id).pipe(map((res:any)=> {
      return res
    }))
  }
}
