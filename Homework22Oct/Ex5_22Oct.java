//5. Write a program to find all prime numbers up to a user-specified limit.
//// Ex.3 sesiune 22 0ct. George Radulescu

import java.util.Scanner;

public class Ex5_22Oct {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = userinput.nextInt();
        findPrimeNumbers(number);
    }

    public static void findPrimeNumbers(int a){
        for (int i = 0; i < a ; i++) {      // facem iteratia pentru fiecare i pana la numarul introdus de user
            int numarDivizori = 0;          // setam numarul de divizori la zero. In functie de asta identificam numerele prime
            for (int d = 1; d <= i; d++) {  //facem iteratie pentru a verifica pentru fiecare i cati divizori are.
                if(i%d == 0){               // daca restul impartirii este zero (modulo == 0) atunci incrementam divizori
                    numarDivizori++;
                }
            }
            if(numarDivizori==2){           // daca sunt doar doi divizori atunci numarul este prim.
                System.out.println("Numar Prim: " + i);
            }
        }
    }
}
