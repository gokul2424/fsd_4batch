import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
    name: 'captialize'
})
export class CapitalizePipe implements PipeTransform {

    transform(value: string, args: any) {
        console.log(value)
        if(value){
          return value[0].toUpperCase() + value.slice(1).toLowerCase()
        }
        
    }

}