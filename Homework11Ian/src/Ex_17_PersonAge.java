import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * 17. Create a class Person with name and age fields. From a list of persons,
 * find the oldest person using max().
 */

public class Ex_17_PersonAge {
    public static void main(String[] args) {
        List<Person> myPersonList = List.of(
                new Person("Andrei",25),
                new Person("Barbu",35),
                new Person("Costel",15),
                new Person("Dumitru",23),
                new Person("Eugen",34)
        );

        System.out.println(" --- Initial List --- ");
        System.out.println(myPersonList);

        Optional<Person> oldestPerson = myPersonList.stream()
                .max(Comparator.comparingInt(Person::getAge));

        System.out.println(oldestPerson);

    }


}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person {" +
                "Name='" + name + '\'' +
                ", age =" + age +
                '}';
    }


}
