package ExampleCars;

public class Car {
    private String make;
    private String model;
    private int displacement;

    public Car(String make, String model, int displacement) {
        this.make = make;
        this.model = model;
        this.displacement = displacement;
    }

    public void showCarDetails() {
        System.out.println("-----------------------------");
        System.out.println("Make = " + make +
                " Model = " + model +
                " Engine displacement  = " + displacement);
    }
}