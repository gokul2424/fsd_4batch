class Employee{
    // id: number;
    // name: string;
    // salary: number;

    static count: number = 0
    
    constructor(private id: number, private name: string, private _salary:number){
        // this.id= id;
        // this.name = name;
        // this.salary = salary;
        Employee.count++;
    }

    set salary(newSalary: number){
        if(newSalary>0){
            this._salary = newSalary
        }
 
    }

    get salary(): number {
        return this._salary;
    }


    incrementSalary(incrementAmount: number)  : boolean{
        this.salary = this.salary + incrementAmount
        return true;
    }
}

let emp : Employee = new Employee(33, "Ravi" , 34333.33);
// emp.salary = -3;
emp.salary = 33
console.log('Object count ', Employee.count)
let emp2 : Employee = new Employee(323, "Priya" , 44333.33);
console.log('Object count ', Employee.count)
// emp.id = 33
// emp.name = "Ravi"
// emp.salary = 34343.34

console.log(emp)
// console.log(emp.name)

emp.incrementSalary(3000);

console.log(emp);