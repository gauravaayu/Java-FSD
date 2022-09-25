import { Component, OnInit } from '@angular/core';
import { ListService } from '../list.service';
import { UserClass } from '../UserClass';
import {FormGroup,FormBuilder} from '@angular/forms'
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
@Component({
  selector: 'app-crud-operation',
  templateUrl: './crud-operation.component.html',
  styleUrls: ['./crud-operation.component.css']
})
export class CrudOperationComponent implements OnInit {

  constructor(private service:ListService,private formBuilder:FormBuilder ,private http:HttpClient,private router:Router) { }
  public signupForm!:FormGroup
  users: UserClass[] = [];
  usersObj:UserClass=new UserClass()
  
  btnUpdateShow:boolean = false;

  btnSaveShow:boolean = true;

 
    ngOnInit(): void {
      this.service.getAllUsers().subscribe(result=>this.users=result);
      this.signupForm=this.formBuilder.group({
        fullname:[''],
        email:[''],
        password:[''],
        mobile:['']
      
      })
    }
    AddUser(){
      this.SaveShowBtn();
      this.http.post<any>("http://localhost:3000/users",this.signupForm.value)
      .subscribe(res=>{
        alert("User added successfully");
        this.signupForm.reset(); 
        this.router.navigate(['ManageUser'])
       
        window.location.reload()
      },err=>{
        alert("Something went wrong")
      })

}
DeleteUser(row :any){
  this.service.DeleteUserDetails(row.id).subscribe(res=>{
    alert("User Deleted")
    window.location.reload();
  })

}

UpdateUser(row :any){

this.signupForm.controls['fullname'].setValue(row.value);
this.signupForm.controls['email'].setValue(row.value);
this.signupForm.controls['password'].setValue(row.value);

this.signupForm.controls['mobile'].setValue(row.value);
this.usersObj.id=row.id
this.UpdateShowBtn();
}
UpdateUserDetails(){
  this.usersObj.fullname=this.signupForm.value.fullname
  this.usersObj.email=this.signupForm.value.email
  this.usersObj.password=this.signupForm.value.password
 
  this.usersObj.mobile=this.signupForm.value.mobile
 this.service.UpdateUserDetailing(this.usersObj,this.usersObj.id).subscribe(res=>{
  alert("Data updated successfully")
  
  window.location.reload();
 })
 
}
UpdateShowBtn()
  {
   
    this.btnUpdateShow = true;
    this.btnSaveShow = false;
  }
  SaveShowBtn()
  {
  
    this.btnUpdateShow = false;
    this.btnSaveShow = true;
  }
}
