import { Component, OnInit } from '@angular/core';
import {Todo} from './todo'
import { TodoService } from './services/todo.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'app';
  todos: Array<Todo> = []

  constructor(private todoService: TodoService){

  }

  ngOnInit(){
   this.todoService.fetchTodos()
   .then(data => this.extractData(data))
  }

  addTodo(todo: string){
    this.todoService.addTodo(todo)
    .then(data => this.extractData(data))
  }

  removeTodo(index: number){
    this.todoService.removeTodo(index)
    .then(data => this.extractData(data))
  }

  extractData(data){
    console.log(data);
    this.todos = data
  }
}
