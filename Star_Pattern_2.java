public class Star_Pattern_2 {
    public static void main(String[] args) {
        System.out.println("*-*-*-*-*-* STAR PATTERN *-*-*-*-*-*\n\n");
        int row=7;
        int col=1;
        int spc=6;

        for(int i=0;i<row;i++){
            for (int j=0; j<spc;j++) {
                System.out.print(" ");
            }
            for (int j=0; j<col;j++) {
                System.out.print("* ");
            }
            System.out.println();
            spc--;
            col++;
        }
    }
}





//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
//   * * * * * *
//  * * * * * * *