
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Box example:

        Box<Integer> myBox = new Box<>(10);
        System.out.println("Value of Box as Integer is : " + myBox.getBoxItem());
        myBox.clearBoxItem();
        System.out.println("Value of Box is now: " + myBox.getBoxItem());

        Box<String> mySecondBox = new Box<>("");
        mySecondBox.setBoxItem("Whatever");
        System.out.println("Value of Box as String is : " + mySecondBox.getBoxItem());
        myBox.clearBoxItem();
        System.out.println("Value of Box is now: " + mySecondBox.getBoxItem());

        // Pair example:

        Pair<Integer, String> myFirstPair = new Pair<>(1, "First");
        System.out.println("Key value is: " + myFirstPair.getKey() + " and value is : " + myFirstPair.getValue());

        //Container example:
        Container<Integer> myContainer = new Container<>();
        myContainer.addElements(5);
        myContainer.addElements(6);
        myContainer.addElements(7);
        System.out.println("Sum of elements is " + myContainer.sumElemnts());

        //Shape Container
        ShapeContainer<Shapes> myInitialShapes = new ShapeContainer<>();
        Shapes myCircle = new Shapes("Circle");
        Shapes myRectangle = new Shapes("Rectangle");
        myInitialShapes.addShape(myCircle);
        myInitialShapes.addShape(myRectangle);

        List<Shapes> myNewList = new ArrayList<>();
        Shapes circle1 = new Shapes("Circle1");
        Shapes circle2 = new Shapes("Circles2");
        Shapes rectangle = new Shapes("Rectangle1");

        myInitialShapes.addUnknownShape(myNewList);

        //ListUtil example:

        ListUtil<Integer> newListUtil = new ListUtil<>();
        List<Integer> testList = new ArrayList<>();
        testList.add(0,10);
        testList.add(1,20);
        testList.add(2,30);
        testList.add(3,40);
        testList.add(4,50);

        int test = newListUtil.countGreaterThan(testList,25);
        System.out.println(test);

        // Day Enum example:

        DayTest.Day today = DayTest.Day.SATURDAY;
        if(today.isWeekDay()){
            System.out.println("It's a weekday");
        } else{
            System.out.println("It's weekend !");
        }

        //Season enum example:

        SeasonTest.Season newSeason = SeasonTest.Season.SUMMER;
        System.out.println("Season: " + newSeason);
        System.out.println("Average Temperature: " + newSeason.getAverageTemperature());
        System.out.println("Description: " + newSeason.getDescription());

        //TrafficLight Example:

        TrafficLightClass.TrafficLight currentLight = TrafficLightClass.TrafficLight.RED;

        for (int i = 0; i < 5; i++) {
            System.out.println(currentLight);
            currentLight = currentLight.next();
        }

        //Coffee enum example:

        Kaffe.CoffeSize myCoffee = Kaffe.CoffeSize.MEDIUM;
        System.out.println("Cost of "+ myCoffee.getDescription() + " coffee is " + myCoffee.getPrice() +
                " and has " + myCoffee.getVolume()+ " ml.");




    }
}
