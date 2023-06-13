package StringProgram;

import java.util.*;


public class StringReverse_1 {
    public static void main(String[] args) {
        System.out.println("------- String Reverse (using charAt)-------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = scan.nextLine();
        String rev = "";

        for (int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

        System.out.println("Reverse of given String is : "+rev);
    }
}
