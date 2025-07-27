

public class FactorialNumber {
    public static void main(String[] args) {
        int factorial = 14;
        if (factorial > 0) {
            long  result =1;
            for (int i = 1; i <= 55; i++) {
                result = result * i;
                System.out.println(result);
                System.out.println(i);
            }
            System.out.println("result = " + result);
        } else {
            System.out.println("Number is less than One");
        }

    }
}
