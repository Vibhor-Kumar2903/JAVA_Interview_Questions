package StringProgram;

import java.util.Scanner;

public class StringReverse_2 {
    public static void main(String[] args) {
        System.out.println("-------- String Reverse (toCharArray) --------");
        System.out.println("Enter a string : ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] ch = str.toCharArray();
        String rev = "";

        System.out.print("Reverse of given string : ");
        for(int i=ch.length-1; i>=0; i--){
            rev = rev + ch[i];
        }

        System.out.print(rev);
    }
}
