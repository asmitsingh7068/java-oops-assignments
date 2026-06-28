public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    // Default Constructor
    public PartTimeEmployee() {

    }

    // Parameterized Constructor
    public PartTimeEmployee(int empId, String empName, String department,
                            int hoursWorked, double hourlyRate) {

        super(empId, empName, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Salary Calculation
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    // Display Details
    @Override
    public void displayEmployee() {
        super.displayEmployee();
        System.out.println("Employee Type : Part Time");
        System.out.println("Hours Worked : " + hoursWorked);
        System.out.println("Hourly Rate : " + hourlyRate);
        System.out.println("Salary : " + calculateSalary());
    }
}