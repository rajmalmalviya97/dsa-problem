public class TrainglePattern {
 public static void main(String[] args) {
    int row = 6;

    for(int i = 0; i<row;i++){
        for(int j = 0; j<i ;j++){
            System.err.print("*");
        }
        System.out.println("");
    }
      System.out.println("");
    //Lower Decreasing Traingle
    for(int i = row; i>0;i--){
        for(int j = i; j>0 ;j--){
            System.err.print("*");
        }
        System.out.println("");
    }
 }   
}
