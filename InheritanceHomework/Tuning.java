package ExampleCars;

public class Tuning extends SportCars {

    private String color;

    public Tuning(String make, String model, int displacement) {
        super(make, model, displacement);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showTunedCar(){
        showSportCarsDetails();
        System.out.println("Tuned car color is " + color);
    }
}
