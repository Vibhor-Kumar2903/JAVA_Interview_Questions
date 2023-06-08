public class Star_Pattern_5 {
    public static void main(String[] args) {
        System.out.println("*-*-*-*-*-* STAR PATTERN *-*-*-*-*-*\n\n");

        int row = 10;
        int col = 10;
        int spc = 0;

        for (int i=0; i<row; i++){
            for (int j=spc; j>0; j--){
                System.out.print(" ");
            }
            for (int j=0; j<col; j++){
                System.out.print("*");
            }
            col--;
            spc++;
            System.out.println();
        }
    }
}



//        **********
//        *********
//        ********
//        *******
//        ******
//        *****
//        ****
//        ***
//        **
//        *