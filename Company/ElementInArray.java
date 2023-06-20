package Company;
// Write program to check element exist or not within array list. If exist then it will return true and if not exist then it should return false.
import java.util.Scanner;

public class ElementInArray {
    public static void main(String[] args) {
        System.out.println("-------- Element In Array -------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int arr_l = scan.nextInt();

        int[] arr = new int[arr_l];
        System.out.print("Enter elements in array : ");
        for (int i = 0; i < arr_l; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("\nElements of array are : ");
        for (int element : arr) {
            System.out.print(element+" ");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nEnter the number to check whether it is present or not : ");
        int num = scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
    }
}
