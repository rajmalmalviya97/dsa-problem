public class TrainglePattern {
 public static void main(String[] args) {
    int row = 6;

    for(int i = 0; i<row;i++){
        for(int j = 0; j<i ;j++){
            System.err.print("*");
        }
        System.out.println("");
    }
 }   
}
