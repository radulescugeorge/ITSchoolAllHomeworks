//Write a program that calculates various statistics for an array of integers.
// (find max, min, and average);
//Ex.2 sesiune 22 0ct. George Radulescu

import java.util.Random;

public class Ex2_22Oct {
    public static void main(String[] args) {
        Random aleator = new Random();
        int[] randomArray = new int[5];

        // sa punem valori in array
        int i = 0;
        while (i < 5) {
            randomArray[i] = aleator.nextInt(20);
            System.out.println("randomArray[" + i + "] are valoarea " + randomArray[i]);
            i++;
        }


        int max = maxOfArray(randomArray);
        int min = minOfArray(randomArray);
        int average = averageOfArray(randomArray);

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Average = " + average);

    }
// max method
    private static int averageOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
//min method
    private static int minOfArray(int[] array) {
        int mi = array[0];
        for (int k = 0; k < array.length; k++) {
            if (array[k] < mi) {
                mi = array[k];
            }
        }
        return mi;
    }
//average method
    private static int maxOfArray(int[] array) {
        int mx = 0;
        for (int j : array) {
            if (j > mx) {
                mx = j;
            }
        }
        return mx;
    }
}
