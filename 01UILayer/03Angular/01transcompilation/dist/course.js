"use strict";
// class Course{
//     constructor(public id: number, public title:string, public summary:string){
Object.defineProperty(exports, "__esModule", { value: true });
//     }
// }
// let course: Course = new Course(12, "Angular", "sdklasdgjkldskl ds ");
// let course2: Course = new Course(132, "React", "sdf ds ");
// console.log(course)
var Course = /** @class */ (function () {
    //  name:string;    
    //  id:number;    
    function Course(name, id) {
        this.name = name;
        this.id = id;
    }
    Course.prototype.getName = function () { return "hello"; };
    return Course;
}());
exports.Course = Course;
var course = new Course("Angular", 3434);
console.log(course.getName());
//# sourceMappingURL=course.js.map