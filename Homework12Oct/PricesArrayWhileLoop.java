//12. Initialize an array of double numbers representing prices.
// Using a while loop, sum all the prices until a price greater than 100 is encountered,
// then stop and display the sum up to that point.
// Tema George Radulescu 12 oct

public class PricesArrayWhileLoop {
    public static void main(String[] args) {
        int[] prices = new int[]{15,20,25,75,99,100,102,45};
        int sum=0;
        int k = 0;

        while (k < prices.length){
            if(prices[k] > 100){
                break;
            } else{
                sum = sum + prices[k];
                k++;
            }
        }
        System.out.println("Sum is "+sum);
    }
}
