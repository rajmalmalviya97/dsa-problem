class CheckType{
    public static void main(String[] args) {
      // Integer value = 456;

     // boolean value = true;
      // System.out.println(value.getclass().getName()); 
    //  System.out.println(value.getclass().getSimpleName());

    // New code Form Chat Gpt

   // double  value = 456.785; // int primitive auto-boxed to Integer
    Object value=7870;

        if (value instanceof Integer) {
            System.out.println("Type is: Integer");
        } else if (value instanceof Double) {
            System.out.println("Type is: Double");
        } else if (value instanceof Boolean) {
            System.out.println("Type is: Boolean");
        } else if (value instanceof String) {
            System.out.println("Type is: String");
        } else {
            System.out.println("Type is: Unknown");
        }

        // You can also print class name directly
        System.out.println("Actual class: " + value.getClass().getSimpleName());


      // for(int i = 0 ; i<5000;i++){
      //    for(int j = 0; j<i ; j++){
      //       for(int k=5; k<=8000;k++){
      //           if(k==5555){
      //             //  exit;
      //             System.out.println("yes inside condition");
      //            // break;
      //             exit;
      //           }
      //       }
      //    }
      // }

      // System.out.println("yes outside");


    }
}