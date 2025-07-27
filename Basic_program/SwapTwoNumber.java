public class SwapTwoNumber {
    public static void main(String[] args) {
        int num_1 = 45874;
        int num_2 = 2323;

        num_1 = num_1 + num_2;
        num_2 = num_1 - num_2;
        num_1 = num_1 - num_2;

        System.out.println("num 1 "+num_1);
        System.out.println("num 2 "+num_2);


    }
}
