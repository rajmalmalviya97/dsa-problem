import java.util.Map;

public class AllPrint {
    public static void main(String[] args){
      //s String systemInfo = System.getenv();
       Map<String, String> system_info = System.getenv() ;
       String path = System.getenv("PATH");
        String os = System.getenv("OS");
        String no_of_processsor = System.getenv("NUMBER_OF_PROCESSORS");
      // System.out.println("System Information "+system_info);
        //System.out.println("No ofProcesssor "+no_of_processsor);
      // System.out.println("path -"+os);

      char d ='d';
      float f = 4.55f;

      System.out.printf("print char %c & float is %f ",d,f);
    }
}
