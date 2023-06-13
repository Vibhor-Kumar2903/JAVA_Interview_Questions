package NumberProgram;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("-------- Armstrong Number --------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        int original_num = num;
        int r,cube = 0;

        do{
            r = num%10;
            num = num/10;
            cube = cube+(r*r*r);
        }while (num!=0);
        if(cube==original_num){
            System.out.println(original_num+" is armstrong number");
        }else{
            System.out.println(original_num+" is not a armstrong number");
        }
    }
}
