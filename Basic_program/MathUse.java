public class MathUse {
    public static void main(String[] args) {
        int a = 40;
        int b= -5;
       int result =  Math.max(a,b);

     //  System.out.println("Max = "+result);

       int min = Math.min(-4,-5);
     //  System.out.println("min "+min);

       float c = -11.454f;
     //  System.out.println("math abs "+Math.abs(c));

       double ceil = 1.12;
      // System.out.println("Ceil = "+Math.ceil(ceil));
       //System.out.println("Floor = "+Math.floor(ceil));

       //Random Number
       System.out.println("Random Number = "+(int)(Math.random()*100));
    }
}
