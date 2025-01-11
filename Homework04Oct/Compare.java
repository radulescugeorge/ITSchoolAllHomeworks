/* Homework George Radulescu
Write a Java program to compare two numbers;
 */

public class Compare {
    public static void main(String[] args) {
        int v1 = 25;
        int v2 = 35;
        int diferenta = v1 - v2;
        System.out.println("v1 greater than v2 ? " + ( diferenta > 0 ));
        System.out.println("v1 lower than v2 ? " + ( diferenta < 0 ));
        System.out.println("v1 equals v2 ? " + ( diferenta == 0 ));
    }
}
