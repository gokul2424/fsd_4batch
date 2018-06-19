import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { CourseComponent } from './course.component';

import { AppComponent } from './app.component';


@NgModule({
  declarations: [
    AppComponent, CourseComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
