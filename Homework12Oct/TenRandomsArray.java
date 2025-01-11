//10. Initialize an array of integers with 10 random values.
// Use a FOR loop to find and print the smallest and largest elements in the array.
// Tema George Radulescu 12 oct

import java.util.Random;

public class TenRandomsArray {
    public static void main(String[] args) {
        Random aleator = new Random();
        int[] randomArray = new int[10];
        int i = 0;
        int max = randomArray[0]; // declarat aici preia valoarea zero

// sa punem valori in array
        while (i < 10) {
            randomArray[i] = aleator.nextInt(100);
            System.out.println("Pozitia i " + i + " are valoarea " + randomArray[i]);
            i++;
        }
// sa-l cautam pe max cu varianta FOR EACH

        for (int j: randomArray) {
            if(j > max){
                max = j;
            }

        }
//        varianta veche FOR
//        for (int j = 0; j < randomArray.length; j++) {
//            if (randomArray[j] > max) {
//                max = randomArray[j];
//            }
//        }
        System.out.println("Max is " + max);
// sa-l cautam pe min

        int min = randomArray[0];
        // declarat aici in loc de inceput langa max
        // pentru a se initializa cu valoare(nu cu zero)

        for (int k = 0; k < randomArray.length; k++) {
            if (randomArray[k] < min) {
                min = randomArray[k];
            }
        }
        System.out.println("Min is " + min);
    }
}
