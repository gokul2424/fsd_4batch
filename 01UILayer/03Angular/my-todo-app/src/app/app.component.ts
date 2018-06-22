import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';
import {Todo} from './todo'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'app';
  todos: Array<Todo> = []

  constructor(private http: Http){

  }

  ngOnInit(){
    this.http.get('assets/dummy.json')
    .toPromise()
    .then(res=>res.json())
    .then(data => {
      console.log(data);
      this.todos = data
    })
  }

  addTodo(todo: string){
    this.todos.push({text: todo});
  }
}
