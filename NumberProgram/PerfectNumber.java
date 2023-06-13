package NumberProgram;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("-------- Perfect Number --------");
        System.out.print("Enter a number : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;

        for (int i=1; i<num; i++){
            if ((num%i)==0){
                sum += i;
            }
        }

        if (num == sum){
            System.out.println(num+" is a perfect number");
        }else{
            System.out.println(num+" is not a perfect number");
        }





    }
}
