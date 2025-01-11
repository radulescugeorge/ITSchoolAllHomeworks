/*
Homework George Radulescu
Write a Java program that takes a number as input and
prints its multiplication table up to 10;
 */

public class TablaInmultirii {
    public static void main(String[] args) {
        int x = 5;
        for ( int y = 1; y < 11; y++){
            int produsul = x * y;
            System.out.println( x + "*" + y + " egal cu " + produsul);
        }
    }
}
