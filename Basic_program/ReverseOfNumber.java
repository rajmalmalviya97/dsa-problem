public class ReverseOfNumber {
    public static void main(String[] args) {
        int number = 545698;
        System.out.println(reverseTheNumber(number));
    }

    static int reverseTheNumber(int number) {
        int reverse = 0;
        while (number > 0) {
            int num = number % 10;
            reverse = reverse * 10 + num;
            number = number / 10;
        }
        return reverse;
    }
}
