package StringProgram;

import java.util.Scanner;

public class StringReverse_3 {
    public static void main(String[] args) {
        System.out.println("-------- String Reverse (String Builder) --------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = scan.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();

        System.out.println("Reverse of given strinig is : "+sb);


    }
}
