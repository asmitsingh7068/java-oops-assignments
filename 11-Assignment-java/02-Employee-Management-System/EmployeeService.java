import java.util.ArrayList;

public class EmployeeService {

    private ArrayList<Employee> employeeList = new ArrayList<>();

    // Add Employee
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        System.out.println("Employee Added Successfully.");
    }

    // Display All Employees
    public void displayAllEmployees() {

        if (employeeList.isEmpty()) {
            System.out.println("No Employee Found.");
            return;
        }

        for (Employee employee : employeeList) {
            employee.displayEmployee();
            System.out.println("--------------------------------");
        }
    }

    // Search Employee by ID
    public void searchEmployee(int empId) {

        boolean found = false;

        for (Employee employee : employeeList) {

            if (employee.empId == empId) {
                employee.displayEmployee();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee Not Found.");
        }
    }

    // Delete Employee by ID
    public void deleteEmployee(int empId) {

        Employee removeEmployee = null;

        for (Employee employee : employeeList) {

            if (employee.empId == empId) {
                removeEmployee = employee;
                break;
            }
        }

        if (removeEmployee != null) {
            employeeList.remove(removeEmployee);
            System.out.println("Employee Deleted Successfully.");
        } else {
            System.out.println("Employee Not Found.");
        }
    }

}