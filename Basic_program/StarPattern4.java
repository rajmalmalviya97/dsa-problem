public class StarPattern4 {
  public static void main(String[] args) {
    int rows = 6;
    int star = rows;
    int space = 0;
    for (int i = 0; i < rows; i++) {

      for (int j = 1; j < space; j++) {
        System.out.print("\t");

      }

      for (int j = 0; j < star; j++) {
        System.out.print("*\t");

      }
      star--;
      space++;
      System.out.println();

    }
  }
}