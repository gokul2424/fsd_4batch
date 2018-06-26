import { Pipe, PipeTransform } from '@angular/core';
import { Course } from '../Course';

@Pipe({
    name: 'filterCourses'
})
export class FilterCoursesPipe implements PipeTransform {

    transform(courses: Array<Course>, args: string) {
        console.log(courses);
        console.log(args);
        let searchedCourses = courses.filter( (course: Course) => {
            return course.caption.includes(args) 
        });
        console.log(searchedCourses)
        return searchedCourses;
    }

}