package Company;
//Write program to find second maximum from Array
import java.util.Scanner;

public class SecMaxElement {

    public static int getSecondLargest(int[] a, int total){
        int temp;
        for (int i=0; i<a.length; i++){
            for (int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }

    public static void main(String[] args) {
        System.out.println(" ------ Second Max Element In Array ------ ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int arr_l = scan.nextInt();

        int[] arr = new int[arr_l];

        System.out.print("Enter array element : ");
        for (int i=0; i<arr_l; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Elements of array : ");
        for (int element : arr){
            System.out.print(element+" ");
        }

        System.out.println("Second Largest element: "+getSecondLargest(arr, arr_l));






    }
}
