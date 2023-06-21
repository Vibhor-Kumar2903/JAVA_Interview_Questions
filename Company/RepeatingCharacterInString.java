package Company;

import java.sql.SQLOutput;
import java.util.Scanner;

// Write program to find first repeated character from string
public class RepeatingCharacterInString {
    public static void main(String[] args) {
        System.out.println(" ------ Repeating Character In A String ------- ");
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter you string : ");
        String str = scan.nextLine();

        System.out.println("Given string is : "+str);

        char[] ch_str = str.toLowerCase().toCharArray();
        int countRepeat;

        for (int i=0; i<ch_str.length; i++){
            countRepeat = 0;
            for (int j=0; j<ch_str.length; j++) {
                if (ch_str[i] == ch_str[j]) {
                    countRepeat++;
                }
                if (ch_str[i] == ch_str[j] && (i > j)) {
                    break;
                }
            }
            if(countRepeat>1) {
                System.out.print("\n" + ch_str[i] + " is repeated " + countRepeat + " times.");
            }
        }
    }
}
