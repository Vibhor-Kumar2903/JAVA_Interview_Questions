package Company;

import java.util.Arrays;
import java.util.Scanner;

// Write program to check 2 strings are anagrams or not.
public class AnagramString {
    public static void main(String[] args) {
        System.out.println("----- Check two strings are Anagram ------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First String : ");
        String str1 = scan.nextLine();
        System.out.print("Enter Second String : ");
        String str2 = scan.nextLine();

        if(str1.length() == str2.length()){
            System.out.println("Given Strings are equal in length");
            System.out.println("Validating the strings for anagrams");
            char[] ch_arr1 = str1.toLowerCase().toCharArray();
            char[] ch_arr2 = str2.toLowerCase().toCharArray();

            Arrays.sort(ch_arr1);
            Arrays.sort(ch_arr2);

            boolean result = Arrays.equals(ch_arr1, ch_arr2);

            if(result){
                System.out.println("Given strings are anagrams");
            }else{
                System.out.println("Given strings are not anagrams");
            }
        }else{
            System.out.println("Given Strings are of different lengths and can't be anagrams ");
        }










    }
}
