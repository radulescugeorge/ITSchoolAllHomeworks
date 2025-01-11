package ExampleCars;

public class Main {
    public static void main(String[] args) {
        Car myStandardCar = new Car("Dacia ","1310 ",1300);
        myStandardCar.showCarDetails();

        SportCars mySport = new SportCars("Ferrari ","Testarossa ",5500);
        mySport.setMaxspeed(300);

        mySport.showSportCarsDetails();

        Tuning tunedCar = new Tuning("Nissan ","Z350",3200);
        tunedCar.setMaxspeed(290);
        tunedCar.setColor("Blue");
        tunedCar.showTunedCar();

        System.out.println("And use the parent's methods");
        tunedCar.showCarDetails();
        tunedCar.showSportCarsDetails();


    }

}
