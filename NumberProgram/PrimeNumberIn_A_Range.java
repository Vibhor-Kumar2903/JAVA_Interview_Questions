package NumberProgram;

import java.util.Scanner;

public class PrimeNumberIn_A_Range {
    public static void main(String[] args) {
        System.out.println("---------Prime Number----------");
        System.out.println("Enter a Range : ");
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter start Range : ");
        int s_range = scan.nextInt();
        System.out.print("Enter end Range : ");
        int e_range = scan.nextInt();
        int total_prime = 0;

        for (int i=s_range; i<=e_range; i++){
            int count = 0;

            for (int j=1; j<=i; j++){
                if (i%j == 0){
                    count++;
                }
            }

            if(count == 2){
                System.out.println(i+" is a prime number");
                total_prime++;
            }else{
                System.out.println(i+" is not a prime number");
            }
        }

        System.out.println("Total number of Prime Numbers in given range : "+total_prime);


    }
}
