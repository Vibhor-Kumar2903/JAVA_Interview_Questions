package Arrays;

public class CountArrayElement {
    public static void main(String[] args) {
        System.out.println("------- Count Array -------");
        int arr[] = {10,16,2,9,15,18,11};
        int count=0;

        for(int i=0; i<arr.length; i++){
            count++;
        }

        System.out.println("Array contains "+count+" elements in it.");
    }
}
