import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { FilterTodoPipe } from './pipes/filtertodos.pipe';
import { TodoService } from './services/todo.service';

@NgModule({
  declarations: [
    AppComponent, FilterTodoPipe
  ],
  imports: [
    BrowserModule, HttpModule
  ],
  providers: [TodoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
