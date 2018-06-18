import { Component, OnInit } from '@angular/core';
import {Course} from './course';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'app';
  name: string = "Puneet Vashisht"
  courses: Array<Course> = [];
  
  ngOnInit() { 
    let course: Course = new Course(12, "Angular", "sdklasdgjkldskl ds ");
    let course2: Course = new Course(132, "React", "sdf ds ");
    console.log(course)
    this.courses.push(course);
    this.courses.push(course2);
    console.log(this.courses);

  }

}

