import { Component, OnInit } from '@angular/core';
import { TodoService } from '../../services/todo.service';
import { Todo } from '../../todo';

@Component({
  selector: 'view-todo',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {

  todos: Array<Todo> = []
  constructor(private todoService: TodoService){

  }

  ngOnInit(){
   this.todoService.fetchTodos()
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
