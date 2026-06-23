class Car {
    private Engine engine = new Engine(); // composition

    void startCar() {
        System.out.println("Car is starting...");
        engine.startEngine();
    }
}