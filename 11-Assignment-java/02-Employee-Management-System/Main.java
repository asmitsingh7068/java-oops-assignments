import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        int choice;

        do {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Full Time Employee");
            System.out.println("2. Add Part Time Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Search Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID : ");
                    int ftId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name : ");
                    String ftName = sc.nextLine();

                    System.out.print("Enter Department : ");
                    String ftDept = sc.nextLine();

                    System.out.print("Enter Monthly Salary : ");
                    double salary = sc.nextDouble();

                    FullTimeEmployee fullTimeEmployee =
                            new FullTimeEmployee(ftId, ftName, ftDept, salary);

                    service.addEmployee(fullTimeEmployee);

                    break;

                case 2:

                    System.out.print("Enter Employee ID : ");
                    int ptId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name : ");
                    String ptName = sc.nextLine();

                    System.out.print("Enter Department : ");
                    String ptDept = sc.nextLine();

                    System.out.print("Enter Hours Worked : ");
                    int hours = sc.nextInt();

                    System.out.print("Enter Hourly Rate : ");
                    double rate = sc.nextDouble();

                    PartTimeEmployee partTimeEmployee =
                            new PartTimeEmployee(ptId, ptName, ptDept, hours, rate);

                    service.addEmployee(partTimeEmployee);

                    break;

                case 3:

                    service.displayAllEmployees();

                    break;

                case 4:

                    System.out.print("Enter Employee ID : ");
                    int searchId = sc.nextInt();

                    service.searchEmployee(searchId);

                    break;

                case 5:

                    System.out.print("Enter Employee ID : ");
                    int deleteId = sc.nextInt();

                    service.deleteEmployee(deleteId);

                    break;

                case 6:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 6);

        sc.close();
    }
}