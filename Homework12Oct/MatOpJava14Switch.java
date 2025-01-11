import java.util.Scanner;

//3. Write a program that prompts the user to enter two numbers and an operator (+, -, *, /).
// Use a switch statement to perform the chosen operation and display the result
// (store the result in a variable using Java 14+ Switch statement).
// Tema George Radulescu 12 oct

public class MatOpJava14Switch {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int a=0,b=0,result=0;
        char math_operator;
        try{
            System.out.print("Enter first number: ");
            a = userinput.nextInt();
            System.out.print("Enter Second number: ");
            b = userinput.nextInt();
            System.out.println("Enter Operator (+, -, *, /) : ");
            math_operator = userinput.next().charAt(0);
            if (b == 0 && math_operator == '/'){
                System.out.println("divide by 0");
            } else {
                switch(math_operator){
                    case '+' -> result=a+b;
                    case '-' -> result=a-b;
                    case '*' -> result=a*b;
                    case '/' -> result=a/b;
                    default -> System.out.println("Unknown operator");
                }
                System.out.println("Result is : " + result);
            }

        } catch (Exception e) {
            System.out.println("Check your numbers. You should enter only integers.");
            System.out.println("Error: " +  e);
        }
    }
}
