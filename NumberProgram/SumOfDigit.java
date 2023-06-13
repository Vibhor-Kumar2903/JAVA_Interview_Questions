package NumberProgram;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println("-------Sum of Digits-------");
        System.out.print("Enter a number : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int r,s = 0;

        do{
            r = num%10;
            s = s+r;
            num = num/10;
        }while (num!=0);

        System.out.print("Enter a number : "+s);
    }
}
