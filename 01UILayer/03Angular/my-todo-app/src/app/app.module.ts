import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { FilterTodoPipe } from './pipes/filtertodos.pipe';
import { TodoService } from './services/todo.service';
import { CategoryService } from './services/category.service';
import {RouterModule} from '@angular/router'
import {FormsModule, ReactiveFormsModule} from '@angular/forms'
import { AddComponent } from './components/view/add.component';
import { ViewComponent } from './components/view/view.component';
import { LogService } from './services/log.service';
import { ViewCategoriesComponent } from './components/view-categories/view-categories.component';

const routes = [
  {path:"", component:ViewComponent},
  {path:"add", component:AddComponent},
  {path:"categories", component:ViewCategoriesComponent},

]

@NgModule({
  declarations: [
    AppComponent, FilterTodoPipe, AddComponent, ViewComponent, ViewCategoriesComponent

  ],
  imports: [
    BrowserModule, HttpModule , RouterModule.forRoot(routes), FormsModule, ReactiveFormsModule
  ],
  providers: [TodoService,CategoryService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
