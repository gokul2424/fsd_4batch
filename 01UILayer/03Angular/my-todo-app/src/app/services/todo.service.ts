import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

@Injectable()
export class TodoService {
    baseUrl: string = "http://localhost:7000/"
    
    constructor(private http: Http) { }

    addTodo(todo: string): Promise<any>{
       return this.http.post(this.baseUrl+ 'todo', {text: todo})
        .toPromise().then(res=>res.json())
    }
    fetchTodos(): Promise<any>{
        return this.http.get(this.baseUrl + 'todos')
        .toPromise().then(res=>res.json())
    }
    
    removeTodo(index: number): Promise<any>{
        return this.http.delete(this.baseUrl + 'todos/' + index)
        .toPromise().then(res=>res.json())
      }

}