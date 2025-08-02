public class IsPrime {

    public static String isPrime(int n){
         if(n<1){
            return "Not a Prime";
         }
         if(n==2){
            return "Yes Prime No.";
         }

         for(int i=2 ;i<n ;i++){
           if(n %  i ==0){
            return "Not A Prime No.";
           }
         }
         return "Yes !! Prime No.";
    }
    public static void main(String[] args) {
        System.out.println(isPrime(25));
    }
}
