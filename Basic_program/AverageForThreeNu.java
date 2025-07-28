import java.util.Scanner;

public class AverageForThreeNu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first No.");
        int firstNumber = scan.nextInt();
        System.out.println("Enter the second No.");
        int secondNumber = scan.nextInt();
        System.out.println("Enter the Third No.");
        int thirdNumber = scan.nextInt();

        scan.close();
        int average = (firstNumber + secondNumber +thirdNumber)/3;
        System.out.println("Average is "+average);
    }
}
