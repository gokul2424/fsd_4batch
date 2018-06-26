import { Pipe, PipeTransform } from '@angular/core';
import { Todo } from '../todo';


@Pipe({
    name: 'filterTodos'
})
export class FilterTodoPipe implements PipeTransform {

    transform(todos: Array<Todo>, args: string) {
        console.log(todos);
        console.log(args);
        let searchedTodos = todos.filter( (todo: Todo) => {
            return todo.text.includes(args) 
        });
        console.log(searchedTodos)
        return searchedTodos;
    }

}