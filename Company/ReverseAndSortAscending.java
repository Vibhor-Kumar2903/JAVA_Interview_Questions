package Company;
// Reverse the integer array & sort it in ascending order.
import java.util.Arrays;
import java.util.Scanner;

public class ReverseAndSortAscending {
    public static void main(String[] args) {
        System.out.println("------ Reverse A Given Array And Sort It ------");
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter length of array : ");
        int arr_l = scan.nextInt();

        int[] arr = new int[arr_l];
        System.out.print("\nEnter elements of array : ");
        for (int i=0; i<arr_l; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("\nArray elements are : ");
        for (int element : arr){
            System.out.print(element+" ");
        }

        System.out.print("\nReverse array elements are : ");
        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }

        Arrays.sort(arr);
        System.out.print("\nArray elements after sorting : ");
        for (int element : arr){
            System.out.print(element+" ");
        }

    }
}
