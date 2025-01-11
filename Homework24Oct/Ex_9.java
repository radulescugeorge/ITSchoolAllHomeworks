//9. Write a program to find the largest element in an array of integers.

public class Ex_9 {
    public static void main(String[] args) {
        int[] numbers = {1, 15, 2, 25, 3, 35, 77, 99, 1001, 120, 131, 14};
        int max = numbers[0];

        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Max is " + max);

    }
}
