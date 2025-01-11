/**
 * Create a class ShapeContainer<T> that stores shapes like Circle and Rectangle.
 * Use wildcards to filter shapes or add multiple shapes from a list.
 */

import java.util.ArrayList;
import java.util.List;

public class ShapeContainer <T>{
    private List<T> shapes;

    public ShapeContainer() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(T s){
        shapes.add(s);
    }

    public List<T> getShapes() {
        return shapes;
    }

    public void setShapes(List<T> shapes) {
        this.shapes = shapes;
    }

    public void addUnknownShape(List <? extends T > myUnkShapes){
        shapes.addAll(myUnkShapes);
    }
}
