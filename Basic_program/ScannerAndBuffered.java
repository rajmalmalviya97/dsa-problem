import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerAndBuffered {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a Number");
       // int num = System.in.read();

       InputStreamReader in = new InputStreamReader(System.in);
       BufferedReader bfReader = new BufferedReader(in);

       //String str = bfReader.readLine();
       int number = Integer.parseInt(bfReader.readLine());
       System.out.println(number);


       //Scanner Code

       Scanner sc = new Scanner(System.in);
       int numberfromScanner =  sc.nextInt();

       System.out.println(numberfromScanner);
    }
}
