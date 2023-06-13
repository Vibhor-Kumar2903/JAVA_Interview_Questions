package NumberProgram;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("--------- Prime Number --------");
        System.out.print("Enter the number : ");
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int count = 0;

        for (int i=1; i<=num; i++){
            if (num%i == 0){
                count++;
            }
        }

        if (count == 2){
            System.out.println(num+" is Prime a number");
        }else{
            System.out.println(num+" is not a Prime number");
        }
    }
}
