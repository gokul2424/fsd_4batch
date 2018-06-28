import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { FilterTodoPipe } from './pipes/filtertodos.pipe';
import { TodoService } from './services/todo.service';
import {RouterModule} from '@angular/router'
import {FormsModule, ReactiveFormsModule} from '@angular/forms'
import { AddComponent } from './components/view/add.component';
import { ViewComponent } from './components/view/view.component';
import { LogService } from './services/log.service';

const routes = [
  {path:"", component:ViewComponent},
  {path:"add", component:AddComponent},

]

@NgModule({
  declarations: [
    AppComponent, FilterTodoPipe, AddComponent, ViewComponent

  ],
  imports: [
    BrowserModule, HttpModule , RouterModule.forRoot(routes), FormsModule, ReactiveFormsModule
  ],
  providers: [TodoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
