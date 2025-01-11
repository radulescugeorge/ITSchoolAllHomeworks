//12. Copy the elements of one array into another array.

public class Ex_11 {
    public static void main(String[] args) {
        int[] firstArray = {1, 3, 5, 7, 9};
        int[] secondArray = new int[5];

        for (int i = 0; i < firstArray.length ; ++i) {
            secondArray[i] = firstArray[i];
            System.out.println("Second array ["+i+"] = " + secondArray[i]);
        }

    }
}
