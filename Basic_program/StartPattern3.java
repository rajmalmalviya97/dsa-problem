public class StartPattern3 {
    public static void main(String[] args) {

        int rows =5;
        int space = rows -1;
        int st = 1;
         for (int i = 0; i<rows;i++) {
            for(int j = 1; j<=space;j++)  {
                System.out.print("\t");
            }
            for(int k= 1; k<st;k++){
                System.out.print("*\t");
            }
            space --;
            st ++;
            System.out.println();
            
         }
    }
}