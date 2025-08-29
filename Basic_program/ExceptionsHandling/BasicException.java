package ExceptionsHandling;

public class BasicException {
    public static void main(String[] args) {
        // int numerators[] ={10,22,55,50};
        // int denominators[] = {1,2,0,5};

        // for(int i = 0; i<numerators.length ;i++){
        //     System.out.println(divide(numerators[i],denominators[i]));
        // }
    // try{
    //   level1();
    // }catch(Exception e){
    //    System.out.println("eee= "+e);
    // }
    System.out.println(divide(1 ,0));
    }

    public static void level3(){
        int array[]= new int[5];
        array[5]= 12;
    }

    public static void level2(){
        level3();
    }

    public static void level1(){
        level2();
    }

    public static int divide(int a , int b){
   //  return a/b;
   try{
    return a/b;
   }catch(ArithmeticException e){
    System.out.println("e"+e);
      return -1;
   }finally{
   System.out.println("After Exception---");
   }

   
    }
}
