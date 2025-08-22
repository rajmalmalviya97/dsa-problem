public class PrimeFactorization {
    public static void main(String[] args) {
        //int num1 = 1440;
         int num1 = 46;
        for (int i = 2; i <= num1; i++) {
            while (num1 % i == 0) {
                num1 = num1 /i ; 
                System.out.println(i);
            }
        }
    }
}
