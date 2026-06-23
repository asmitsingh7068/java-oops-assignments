public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Asmit");

        e1.display();
        System.out.println();
        e2.display();
    }
}