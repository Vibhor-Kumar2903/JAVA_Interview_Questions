package NumberProgram;

import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        System.out.println("--------- Extract Digit ---------");
        System.out.print("Enter a number : ");
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        long r=0;
        int count=0;

        do{
            r = num%10;
            num = num/10;
            count++;
        }while(num!=0);

        System.out.println("Given number "+num+" is of "+count+" digit");
    }
}
