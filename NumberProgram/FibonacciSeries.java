package NumberProgram;


import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("---------- Fibonacci Series ----------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the terms up to which you want the fibonacci series : ");

        int limit = scan.nextInt();

        int f = 0;
        int s = 1;
        int t;

        for (int i=0; i<=limit; i++){
            t = f + s;
            System.out.print(f+" ");
            f = s;
            s = t;
        }

    }
}
