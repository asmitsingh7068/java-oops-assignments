public class FullTimeEmployee extends Employee {

    private double monthlySalary;

    // Default Constructor
    public FullTimeEmployee() {

    }

    // Parameterized Constructor
    public FullTimeEmployee(int empId, String empName, String department, double monthlySalary) {
        super(empId, empName, department);
        this.monthlySalary = monthlySalary;
    }

    // Salary Calculation
    public double calculateSalary() {
        return monthlySalary;
    }

    // Display Details
    @Override
    public void displayEmployee() {
        super.displayEmployee();
        System.out.println("Employee Type : Full Time");
        System.out.println("Monthly Salary : " + calculateSalary());
    }
}