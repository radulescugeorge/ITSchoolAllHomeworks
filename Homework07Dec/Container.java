import java.util.ArrayList;
import java.util.List;

/**
 * Design a Container<T> class that accepts only types that extend Number. Add methods to calculate the sum of all elements.
 * @param <T>
 */

public class Container<T extends Number> {

    private List<T> myNumber;

    public Container() {
        this.myNumber = new ArrayList<>();
    }

    public List<T> getMyNumber() {
        return myNumber;
    }

    public void addElements(T t){
        myNumber.add(t);
    }

    public double sumElemnts(){
        double sum = 0;
        for (T t : myNumber) {
            sum = sum + t.doubleValue();
        }
        return sum;

    }
}
