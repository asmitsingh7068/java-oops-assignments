class Employee {
    int id;
    String name;

    Employee() {
        id = 0;
        name = "Unknown";
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
    }
}   