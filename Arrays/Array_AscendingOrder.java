package Arrays;

public class Array_AscendingOrder {
    public static void main(String[] args) {
        System.out.println("------ Array In Ascending Order ------");
        int[] arr = {10,16,2,9,15,18,11};
        int temp;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Array in ascending order : ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
