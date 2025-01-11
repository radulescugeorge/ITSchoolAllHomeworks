//22. Write a method that takes an integer array as input and returns
// a new array with the elements reversed.

public class Ex_21 {
    public static void main(String[] args) {

        int[] firstArray = {1, 3, 5, 7, 9};
        reverseArray(firstArray);
    }

    private static void reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        System.out.print("Reversed array is: ");
        for (int i1 = 0; i1 < reversedArray.length; i1++) {
            System.out.print(reversedArray[i1]);
        }
    }
}