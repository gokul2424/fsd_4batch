import { Component, OnInit } from '@angular/core';
import { TodoService } from '../../services/todo.service';
import { Todo } from '../../todo';
import { LogService } from '../../services/log.service';

@Component({
  selector: 'view-todo',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {

  todos: Array<Todo> = []
  logs: Array<string> =[]
  constructor(private todoService: TodoService, private logService: LogService){

  }

  ngOnInit(){
   this.logs = this.logService.fetchLog()
    
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
