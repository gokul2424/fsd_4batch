var Employee = /** @class */ (function () {
    function Employee(id, name, _salary) {
        this.id = id;
        this.name = name;
        this._salary = _salary;
        // this.id= id;
        // this.name = name;
        // this.salary = salary;
        Employee.count++;
    }
    Object.defineProperty(Employee.prototype, "salary", {
        get: function () {
            return this._salary;
        },
        set: function (newSalary) {
            if (newSalary > 0) {
                this._salary = newSalary;
            }
        },
        enumerable: true,
        configurable: true
    });
    Employee.prototype.incrementSalary = function (incrementAmount) {
        this.salary = this.salary + incrementAmount;
        return true;
    };
    // id: number;
    // name: string;
    // salary: number;
    Employee.count = 0;
    return Employee;
}());
var emp = new Employee(33, "Ravi", 34333.33);
// emp.salary = -3;
emp.salary = 33;
console.log('Object count ', Employee.count);
var emp2 = new Employee(323, "Priya", 44333.33);
console.log('Object count ', Employee.count);
// emp.id = 33
// emp.name = "Ravi"
// emp.salary = 34343.34
console.log(emp);
// console.log(emp.name)
emp.incrementSalary(3000);
console.log(emp);
//# sourceMappingURL=employee.js.map