package ExampleCars;

public class SportCars extends Car {
    private int maxspeed;


    public SportCars(String make, String model, int displacement) {
        super(make, model, displacement);
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public void showSportCarsDetails() {

        super.showCarDetails();
        System.out.println("Max speed= " + maxspeed);
    }
}
