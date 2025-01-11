//4. Create a method to print the elements of a matrix.
// Ex.3 sesiune 22 0ct. George Radulescu

public class Ex4_22Oct {
    public static void main(String[] args) {
        int[][] myMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printMatrix(myMatrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matrix[" + i + "][" + j + "]=" + matrix[i][j]);
            }
        }
    }
}
