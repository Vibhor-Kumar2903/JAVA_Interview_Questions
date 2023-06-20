package Company;

import java.util.Scanner;

// Write program to check if entered string is palindrome or not
public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println("-------- String Palindrome --------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scan.nextLine();
        System.out.print("\nGiven string : "+str);
        String rev = "";
        System.out.println("\nlength of string : "+str.length());
        for (int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("Given string is Palindrome");
        }else{
            System.out.println("Given string is not a Palindrome");
        }




    }
}
