import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = null;

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Update Student");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Roll No : ");
                    int roll = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age : ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Course : ");
                    String course = sc.nextLine();

                    // Object Creation
                    student = new Student(roll, name, age, course);

                    System.out.println("Student Added Successfully.");

                    break;

                case 2:

                    if (student != null) {
                        student.displayStudent();
                    } else {
                        System.out.println("No Student Found.");
                    }

                    break;

                case 3:

                    if (student != null) {

                        sc.nextLine();

                        System.out.print("Enter New Name : ");
                        student.setName(sc.nextLine());

                        System.out.print("Enter New Age : ");
                        student.setAge(sc.nextInt());

                        sc.nextLine();

                        System.out.print("Enter New Course : ");
                        student.setCourse(sc.nextLine());

                        System.out.println("Student Updated Successfully.");

                    } else {

                        System.out.println("No Student Found.");

                    }

                    break;

                case 4:

                    System.out.println("Thank You!");

                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 4);

        sc.close();
    }
}