// class Course{
//     constructor(public id: number, public title:string, public summary:string){

//     }
// }

// let course: Course = new Course(12, "Angular", "sdklasdgjkldskl ds ");
// let course2: Course = new Course(132, "React", "sdf ds ");
// console.log(course)


export class Course {
    //  name:string;    
    //  id:number;    
    constructor(private name: string, private id: number) { }
    public getName(): string { return "hello"; }
}
let course: Course = new Course("Angular", 3434);
console.log(course.getName())