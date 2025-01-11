/**
 * Create a generic class Box<T> that can store a single item of any type.
 * Add methods to set, get, and clear the item.
 */

public class Box<T> {

    private T boxItem;

    public Box(T boxItem) {
        this.boxItem = boxItem;
    }

    public T getBoxItem() {
        return boxItem;
    }

    public void setBoxItem(T boxItem) {
        this.boxItem = boxItem;
    }

    public void clearBoxItem(){
        this.boxItem = null;
    }
}
