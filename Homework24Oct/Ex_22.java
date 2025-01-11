//23. Write two methods: one that finds the minimum and another that finds the maximum value
// in an array of integers.

import java.util.Random;

public class Ex_22 {
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
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

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
