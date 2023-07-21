package Company;

import java.util.Scanner;

//WAP to find max-min pair of an unsorted array.
public class MaxMinPairInArray {
    public static void main(String[] args) {
        System.out.println("-------- Max Min Pair In Unsorted Array --------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int arr_l = scan.nextInt();

        int[] arr = new int[arr_l];
        System.out.print("Enter array elements : ");
        for(int i=0; i<arr_l; i++){
            arr[i]=scan.nextInt();
        }

        System.out.print("\nGiven array elements are : ");
        for(int element:arr){
            System.out.print(element+" ");
        }

        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }

        int min = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("\nMaximum in given array is : "+max);
        System.out.println("Minimum in given array is : "+min);
    }
}
