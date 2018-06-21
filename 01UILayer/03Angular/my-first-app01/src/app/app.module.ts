import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { CourseComponent } from './course.component';

import { AppComponent } from './app.component';
import { BadgeComponent } from './badge.component';
import { CardComponent } from './components/card.component';
import { HttpModule } from '@angular/http';


@NgModule({
  declarations: [
    AppComponent, CourseComponent, BadgeComponent, CardComponent
  ],
  imports: [
    BrowserModule, HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
