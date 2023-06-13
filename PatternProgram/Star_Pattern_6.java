package PatternProgram;

public class Star_Pattern_6 {
    public static void main(String[] args){
        System.out.println("*-*-*-*-*-* STAR PATTERN *-*-*-*-*-*\n\n");

        int row = 10;
        int col = 5;

        for (int i=0; i<=row; i++){
            if (i<row/2){
                for (int j=col; j>i; j--){
                    System.out.print("*");
                }
            }else {
                for (int j=0; j<0; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }
}








//        ******
//        *****
//        ****
//        ***
//        **
//        *
//        **
//        ***
//        ****
//        *****
//        ******