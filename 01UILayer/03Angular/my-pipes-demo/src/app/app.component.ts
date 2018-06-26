import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  message:string = 'Welome to my SEssion!!'
  today:Date = new Date();
  str: string = 'abcdefghij';
}
