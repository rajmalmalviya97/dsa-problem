public class FactorialWithRecursion {
    public static void main(String[] args) {
        int num = 20;
        long result = factorial(num);
        System.out.println("factorial using recusrion = "+result);
    }
    public static long factorial(int num){
        long result = 1;
      while(num>0){
        result = result *num;
        num--;
      }
      return result;
    }
}
