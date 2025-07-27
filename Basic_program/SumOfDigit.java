public class SumOfDigit {
    public static void main(String[] args) {
        int num = 510125;
        // for(int i = 1;i<num.length() ;i++){
            
        // }
        int resultSum = 0;
        while(num>0){
         int number = num %10;
         resultSum = resultSum +number;
         num = num/10;

        }
        System.out.println("sum of numbers digit = "+resultSum);
    }
}
