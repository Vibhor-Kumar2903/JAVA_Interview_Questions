public class Star_Pattern_1 {
    public static void main(String[] args) {
        System.out.println("*-*-*-*-*-* STAR PATTERN *-*-*-*-*-*\n\n");
        int num = 5;
        for(int i=0; i<num; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




//        *
//        **
//        ***
//        ****
//        *****