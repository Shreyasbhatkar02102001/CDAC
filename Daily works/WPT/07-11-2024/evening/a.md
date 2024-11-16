Database connectivity:

user -> app -> Database

express app

index. js -> db config, db logic, processing req and res

MVC design pattern

Model
View -> UI React app/Angular app
Controller

    Employee, Admin, Company, Project
    Model: Represent entities/data (class)

    class Employee{
        constructor(id,name, salary,description,phone){
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.description = description;
            this.phone = phone;
        }
    }

    const data = request.body;
    var emp = new Employee(data.id, data.name, data.salary, data.description,data.phone);
    `"insert into employee values(${emp.id},${emp.name},${emp.salary},${emp.description},${emp.phone})"`

Controller: responsible for processing the request and processing the response
- for each entity create a separate controller