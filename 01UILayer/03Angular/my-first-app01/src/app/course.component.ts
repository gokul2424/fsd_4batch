import {Component} from '@angular/core'
@Component({
    selector: 'my-course',
    template: `
        <h2>Course component</h2>
        <h3>{{courseName}}</h3>
    `
})
export class CourseComponent{
    courseName: string = "Default Course Name"
}

// Steps to create component
// 1. Create a class
// 2. Annotate with @Component
// 3. Imports  
// 4.Make an entry into the module
