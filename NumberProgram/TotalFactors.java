package NumberProgram;

import java.util.Scanner;

public class TotalFactors {
    public static void main(String[] args) {
        System.out.println("-------- Total Factors ---------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        int count = 0;

        for (int i=1; i<=num; i++){
            if (num%i==0){
                System.out.println("Factor of "+num+" is "+i);
                count++;
            }
        }
        System.out.println("Total number of factors for given number "+num+" is "+count);
    }
}
