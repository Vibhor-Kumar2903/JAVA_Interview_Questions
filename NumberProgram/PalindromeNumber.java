package NumberProgram;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("------Palindrome Number-------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();

        int original_num = num;
        int r,s = 0;

        do{
            r = num%10;
            s = (s * 10) + r;
            num = num/10;
        }
        while (num!=0);
            if (s == original_num){
                System.out.println(original_num+" is a Palindrome Number");
            }else{
                System.out.println(original_num+" is not a Palindrome Number");
            }
        }
}
