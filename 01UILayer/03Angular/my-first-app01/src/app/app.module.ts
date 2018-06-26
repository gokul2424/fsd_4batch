import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { CourseComponent } from './course.component';

import { AppComponent } from './app.component';
import { BadgeComponent } from './badge.component';
import { CardComponent } from './components/card.component';
import { HttpModule } from '@angular/http';
import { FilterCoursesPipe } from './pipes/filtercourses.pipe';


@NgModule({
  declarations: [
    AppComponent, CourseComponent, BadgeComponent, CardComponent, FilterCoursesPipe
  ],
  imports: [
    BrowserModule, HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
