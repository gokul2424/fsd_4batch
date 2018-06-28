import { Component, OnInit } from '@angular/core';
import { TodoService } from '../../services/todo.service';
import { LogService } from '../../services/log.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'add-todo',
  styleUrls: ['./add.component.css'],
  template: `
    <div style="text-align:center">
    <h2>Add Todos </h2>
    <div *ngIf="message !== ''" class="alert alert-success" role="alert">
      {{ message}}
    </div>

    <form [formGroup]="myForm" (submit)="addTodo()">
    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text" id="basic-addon1">Add your todo item -> </span>
      </div>
      <input type="text" name="todo" formControlName="todo" class="form-control" placeholder="Enter a todo item" aria-label="Username" aria-describedby="basic-addon1">
    </div>
  
    <button type="submit" class="btn btn-primary" [disabled]="!myForm.valid">Add Todo</button>
    </form>
  
  </div>
    `
})
export class AddComponent implements OnInit {
  message: string = ''
  myForm: FormGroup
  constructor(private todoService: TodoService, private logService: LogService) {

  }
  ngOnInit() {
    this.myForm = new FormGroup({     
      'todo': new FormControl('', [Validators.required] )
    })

  }

  addTodo() {

    let todo = this.myForm.value.todo;
    console.log(this.myForm.value);
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