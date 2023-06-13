package StringProgram;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println("-------- String Palindrome --------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = scan.nextLine();
        String rev = "";

        for (int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

        System.out.println("Reverse of a given string : "+rev);

        if (rev.equals(str)){
            System.out.println(str+" is a palindrome");
        }else{
            System.out.println(str+" is not a palindrome");
        }
    }
}
