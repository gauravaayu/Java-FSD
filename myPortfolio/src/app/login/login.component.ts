import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {FormGroup,FormBuilder} from '@angular/forms'
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  public loginForm !: FormGroup
  constructor(private formBuilder:FormBuilder,private HttpClient:HttpClient,private route:Router) { }

  
  

  ngOnInit(): void {
    this.loginForm=this.formBuilder.group({
      email:[''],
      password:['' ]
    })
  }
  login(){

    this.HttpClient.get<any>("http://localhost:3000/users")
    .subscribe(res=>{
      const user=res.find((a:any)=>{
        return a.email===this.loginForm.value.email && a.password===this.loginForm.value.password
      });
      if(user){
        alert("Login successful");
        this.loginForm.reset();
        this.route.navigate(["portfolio"])
      }
    })
  }

}
