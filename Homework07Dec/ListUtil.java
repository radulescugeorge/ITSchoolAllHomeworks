import java.util.ArrayList;
import java.util.List;

public class ListUtil<T extends Comparable> {


    public int countGreaterThan(List<T> list, int e){
        int counter=0;
        for (T t : list) {
            if(t.compareTo(e) >0){
                counter++;
            }
        }
        return counter;
    }
}
