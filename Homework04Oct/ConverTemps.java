/*
Homework George Radulescu
Write a program that converts a temperature given in Celsius to
Fahrenheit using primitive data types and operators;
 */

public class ConverTemps {
    public static void main(String[] args) {
        double Celsius = 37;
        System.out.println("Celsius: " + Celsius);
        double Fahrenheit = (Celsius*1.8) + 32;
        System.out.println("Fahrenheit: " + Fahrenheit);
    }
}
