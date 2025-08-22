import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number  = scan.nextInt();
        int k = scan.nextInt();
        int originNumber = number;
        int count = 0;
        while(number >0){
            number = number/10;
            count++;
        }

        int div = 1;
        int multi = 1;

        for(int i = 0 ; i<count ;i++){
            if(i<k){
                div = div*10;
            }else{
                multi = multi *10;
            }
        }

        int q = originNumber/div;
        int r = originNumber % div;

        int rev = r * multi + q;
        System.out.println("Reverse nuber "+rev);


    }
}
