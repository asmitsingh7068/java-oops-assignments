# Employee Management System (Core Java)

## 📌 Project Overview

The Employee Management System is a Core Java console-based application that manages Full-Time and Part-Time employees. It demonstrates the use of Object-Oriented Programming concepts such as Inheritance, Constructors, Method Overriding, Polymorphism, Collections, and Menu-Driven Programming.

---

## 🚀 Features

- Add Full-Time Employee
- Add Part-Time Employee
- Display All Employees
- Search Employee by ID
- Delete Employee by ID
- Salary Calculation
- Console Based Menu

---

## 🛠️ Technologies Used

- Java
- Core Java
- OOP
- ArrayList
- Scanner

---

## 📂 Project Structure

```
EmployeeManagementSystem/
│
├── Employee.java
├── FullTimeEmployee.java
├── PartTimeEmployee.java
├── EmployeeService.java
├── Main.java
└── README.md



## 🔄 Workflow

```
                Start
                  │
                  ▼
          Display Menu
                  │
                  ▼
      ┌────────────────────┐
      │ Select an Option   │
      └─────────┬──────────┘
                │
      ┌─────────┼──────────┐
      ▼         ▼          ▼
 Add Employee  Display   Search/Delete
      │         │          │
      └─────────┼──────────┘
                ▼
          Repeat Until Exit
                │
                ▼
               End

# UML Daigram.....

                              +----------------------+
                              |      Employee        |
                              +----------------------+
                              | # empId : int        |
                              | # empName : String   |
                              | # department:String  |
                              +----------------------+
                              | + Employee()         |
                              | + Employee(...)      |
                              | + displayEmployee()  |
                              +----------^-----------+
                                         |
                     --------------------+--------------------
                     |                                       |
                     |                                       |
      +-------------------------------+     +-------------------------------+
      |      FullTimeEmployee         |     |      PartTimeEmployee         |
      +-------------------------------+     +-------------------------------+
      | - monthlySalary : double      |     | - hoursWorked : int           |
      |                               |     | - hourlyRate : double         |
      +-------------------------------+     +-------------------------------+
      | + FullTimeEmployee()          |     | + PartTimeEmployee()          |
      | + FullTimeEmployee(...)       |     | + PartTimeEmployee(...)       |
      | + calculateSalary() : double  |     | + calculateSalary() : double  |
      | + displayEmployee()           |     | + displayEmployee()           |
      +-------------------------------+     +-------------------------------+



                          uses
                            |
                            |
                            ▼

                  +----------------------------------+
                  |        EmployeeService           |
                  +----------------------------------+
                  | - employeeList : ArrayList<Employee> |
                  +----------------------------------+
                  | + addEmployee(Employee)          |
                  | + displayAllEmployees()          |
                  | + searchEmployee(int)            |
                  | + deleteEmployee(int)            |
                  +----------------+-----------------+
                                   |
                                   |
                                   | used by
                                   ▼

                      +--------------------------+
                      |          Main            |
                      +--------------------------+
                      | + main(String[])         |
                      +--------------------------+

# OUTPUT----

C:\Users\R.K.Singh\OneDrive\Desktop\GitHub-Projects\java-oops-assignments\11-Assignment-java\02-Employee-Management-System>java Main

===== Employee Management System =====
1. Add Full Time Employee
2. Add Part Time Employee
3. Display All Employees
4. Search Employee
5. Delete Employee
6. Exit
Enter Your Choice : 1
Enter Employee ID : 111
Enter Employee Name : Asmit
Enter Department : CSE
Enter Monthly Salary : 10000000
Employee Added Successfully.

===== Employee Management System =====
1. Add Full Time Employee
2. Add Part Time Employee
3. Display All Employees
4. Search Employee
5. Delete Employee
6. Exit
Enter Your Choice : 2
Enter Employee ID : 222 
Enter Employee Name : Koaml
Enter Department : CSE
Enter Hours Worked : 4
Enter Hourly Rate : 500
Employee Added Successfully.

===== Employee Management System =====
1. Add Full Time Employee
2. Add Part Time Employee
3. Display All Employees
4. Search Employee
5. Delete Employee
6. Exit
Enter Your Choice : 3
Employee ID : 111
Employee Name : Asmit
Department : CSE
Employee Type : Full Time
Monthly Salary : 1.0E7
--------------------------------
Employee ID : 222
Employee Name : Koaml
Department : CSE
Employee Type : Part Time
Hours Worked : 4
Hourly Rate : 500.0
Salary : 2000.0
--------------------------------

===== Employee Management System =====
1. Add Full Time Employee
2. Add Part Time Employee
3. Display All Employees
4. Search Employee
5. Delete Employee
6. Exit
Enter Your Choice : 4
Enter Employee ID : 222
Employee ID : 222
Employee Name : Koaml
Department : CSE
Employee Type : Part Time
Hours Worked : 4
Hourly Rate : 500.0
Salary : 2000.0

===== Employee Management System =====
1. Add Full Time Employee
2. Add Part Time Employee
3. Display All Employees
4. Search Employee
5. Delete Employee
6. Exit
Enter Your Choice : 4
Enter Employee ID : 44444
Employee Not Found.

===== Employee Management System =====
1. Add Full Time Employee
2. Add Part Time Employee
3. Display All Employees
4. Search Employee
5. Delete Employee
6. Exit
Enter Your Choice : 5
Enter Employee ID : 111
Employee Deleted Successfully.

===== Employee Management System =====
1. Add Full Time Employee
2. Add Part Time Employee
3. Display All Employees
4. Search Employee
5. Delete Employee
6. Exit
Enter Your Choice : 6
Thank You!