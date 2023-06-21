package Company;
// Loop through each element of string and print count of vowels
import java.util.*;
public class CountVowel {
    public static void main(String[] args){
        System.out.println("------- Count Vowel ------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String str = scan.nextLine();
        System.out.print("Given string is : "+str);

        char[] ch_str = str.toLowerCase().toCharArray();
        int countVowel = 0;

        for (int i=0; i<ch_str.length; i++){
            if(ch_str[i]=='a' || ch_str[i]=='e' || ch_str[i]=='i' || ch_str[i]=='o' || ch_str[i]=='u'){
                countVowel++;
            }
        }

        System.out.println("\nNumber of Vowel : "+countVowel);

    }
}
