//19. Write a method that checks if a number is prime or not.

import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = userinput.nextInt();
        findPrimeNumbers(number);
    }

    public static int findPrimeNumbers(int a) {
        int numarDivizori = 0;          // setam numarul de divizori la zero. In functie de asta identificam numerele prime
        for (int d = 1; d <= a; d++) {  //facem iteratie pentru a verifica pentru fiecare i cati divizori are.
            if (a % d == 0) {               // daca restul impartirii este zero (modulo == 0) atunci incrementam divizori
                numarDivizori++;
            }
        }
        if (numarDivizori == 2) {           // daca sunt doar doi divizori atunci numarul este prim.
            System.out.println("Numar Prim: " + a);
        } else {
            System.out.println("Numarul nu este prim: " + a);
        }
        return 0;
    }
}




