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

        System.out.print("Given array elements are : ");
        for(int element:arr){
            System.out.print(element+" ");
        }

        int temp;

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }



    }
}
