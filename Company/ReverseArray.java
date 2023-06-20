package Company;

import java.util.Scanner;

// Write program to make reverse array with the one loop
public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("----------- Reverse Of Given Array -----------");
        Scanner scan =  new Scanner(System.in);
        System.out.print("\nEnter length of array : ");
        int arr_l = scan.nextInt();

        System.out.print("\nEnter array element : ");
        int[] arr = new int[arr_l];
        for (int i=0; i<arr_l; i++){
             arr[i] = scan.nextInt();
        }

        System.out.print("\nGiven array elements are : ");
        for(int element : arr){
            System.out.print(element+" ");
        }

        System.out.print("\nReverse of given array : ");
        for (int i=arr_l-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }

    }
}
