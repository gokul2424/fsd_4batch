import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';
import { Course } from './Course';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'Angular Seed Project';
  courseName = "Angular"

  constructor(private http:Http){

  }

  ngOnInit(){
    console.log('Initialization Method!!')

    this.http.get('http://localhost:4400/assets/dummy.json')
    .toPromise()
    .then(res=>res.json())
    .then((data) => {
      console.log(data)
      this.courses = data
    })
  }


  courses: Array<Course> = []

}
