import java.util.Comparator;
import java.util.List;


/**
 * Create a class Product with name and price fields. From a list of products,
 * find the three most expensive products using streams.
 */

public class Ex_18_TopThreeProducts {

    public static void main(String[] args) {
        List<Product> myProductList = List.of(
                new Product("Bigster",15000),
                new Product("Sandero", 10000),
                new Product("Logan", 13000),
                new Product("Duster", 17000),
                new Product("Solenza", 3000),
                new Product("Berlina 1310", 2500)
        );

        System.out.println(" --- Intial list --- ");
        System.out.println(myProductList);

        List<Product> sortedProduct = myProductList.stream()
                .sorted(Comparator.comparingInt(Product::getPrice).reversed())
                .limit(3)
                .toList();

        System.out.println(" --- Top 3 list --- ");
        System.out.println(sortedProduct);



    }

}
class Product{
    String name;
    int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "Product name: " + name +" at price : " + price ;
    }
}

