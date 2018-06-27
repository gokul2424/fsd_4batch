import { Component, OnInit } from '@angular/core';
import { TodoService } from '../../services/todo.service';
import { LogService } from '../../services/log.service';

@Component({
  selector: 'add-todo',
  template: `
    <div style="text-align:center">
    <h2>Add Todos </h2>
    <div *ngIf="message !== ''" class="alert alert-success" role="alert">
      {{ message}}
    </div>

    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text" id="basic-addon1">Add your todo item -> </span>
      </div>
      <input type="text" #t (change)="0" class="form-control" placeholder="Enter a todo item" aria-label="Username" aria-describedby="basic-addon1">
    </div>
  
    <button type="button" class="btn btn-primary" (click)="addTodo(t.value)">Add Todo</button>
  
  
  </div>
    `
})
export class AddComponent implements OnInit {
  message: string = ''
  constructor(private todoService: TodoService, private logService: LogService) {

  }
  ngOnInit() {

  }

  addTodo(todo: string) {
    this.logService.pushLog(todo);

    this.todoService.addTodo(todo)
      .then(data => this.extractData(data))
  }
  extractData(data){
    console.log(data);
    this.message = "Successfully added a todo!!"
    // this.todos = data
  }

}