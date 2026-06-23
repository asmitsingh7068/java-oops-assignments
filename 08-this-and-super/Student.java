class Student extends Person {
    int rollNo;

    Student(String name, int rollNo) {
        super(name);       // parent constructor call
        this.rollNo = rollNo; // current class variable
    }

    void display() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
    }
}