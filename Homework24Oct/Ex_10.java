//Write a program that calculates the sum of all elements in an array.

public class Ex_10 {
    public static void main(String[] args) {
        int[] numbers = new int[]{15, 20, 25, 75, 99, 100, 102, 45};
        int sum = 0;
        int k = 0;

        while (k < numbers.length) {

            sum = sum + numbers[k];
            k++;

        }
        System.out.println("Sum is " + sum);

    }
}
