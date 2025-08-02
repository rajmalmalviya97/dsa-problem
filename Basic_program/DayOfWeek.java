import java.util.Scanner;

public class DayOfWeek {
   public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int days = scan.nextInt();
      switch(days){
      case 1: "Monday"; break;
        case 2: "Tuesday"; break;
        case 3: "Wednesday"; break;
        case 4: "Thursday"; break;
         case 5:"Friday"; break;
         case 6:"Saturday"; break;
          case 7:"Sunday"; break;
         default : "Invalid" ;break;
       }

   } 
}
