public class StringMethods {
    public static void main(String[] args) {
        String name = "Akshit SharmA";
        int length = name.length();
        //System.out.println(length);
        char c= name.charAt(5);
        System.out.println(c);

        String name_2 = "Akshit Sharma";
       // System.out.println(name.equals(name_2));
       // System.out.println(name.equalsIgnoreCase(name_2));

        String str1 ="sky";
        String str2 = "eky";
       // System.out.println('s'+0);
        //System.out.println('e'+0);

       // System.out.println(str1.compareTo(str2));
        String str_1 ="Amar Panchal";
        String subString = str_1.substring(4);
       // System.out.println(subString);
       // System.out.println(str_1.toLowerCase());
      //  System.out.println(str_1.toUpperCase());

      String new_str = str_1.replace("Pancha","Sharma").toUpperCase();
     // System.out.println(new_str);

  //   System.out.println(str_1.contains("Amar    "));
        String str_2 = "   ";
      System.out.println(str_2.isEmpty());
      System.out.println(str_2.isBlank());

      int a =10;
      String s = String.valueOf(a);
      System.out.println(s);

      String student = String.format("My Name %s and age is %d ","Rajmal Malviya",28);

      System.out.println(student);

    }
}
