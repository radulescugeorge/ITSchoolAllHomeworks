//8. Create a basic calculator program that accepts two numbers and an operator,
// and performs the operation using a switch statement.

import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int a = 0, b = 0, result = 0;
        char math_operator;
        try {
            System.out.print("Enter first number: ");
            a = userinput.nextInt();
            System.out.print("Enter Second number: ");
            b = userinput.nextInt();
            System.out.println("Enter Operator (+, -, *, /) : ");
            math_operator = userinput.next().charAt(0);
            if (b == 0 && math_operator == '/') {
                System.out.println("divide by 0");
            } else {
                switch (math_operator) {
                    case '+' -> result = a + b;
                    case '-' -> result = a - b;
                    case '*' -> result = a * b;
                    case '/' -> result = a / b;
                    default -> System.out.println("Unknown operator");
                }
                System.out.println("Result is : " + result);
            }

        } catch (Exception e) {
            System.out.println("Check your numbers. You should enter only integers.");
            System.out.println("Error: " + e);
        }
    }
}
