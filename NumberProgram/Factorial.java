package NumberProgram;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("----------- Factorial -----------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        int fact = 1;

        for(int i=1; i<=num; i++){
            fact = fact*i;
        }

        System.out.println("Factorial of given number is "+fact);
    }
}
