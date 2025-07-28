import java.util.Scanner;

class ATM  {
    float balance;
    int pin=4455;

    public void checkPin() throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pin");
        int enteredPin = sc.nextInt();

        if(enteredPin == pin){
            System.out.println("Success!! Check Optionss");
            menu();
        }else{
            System.out.println("Pin is Not valid");
        }
    }

    public void menu() throws InterruptedException{
        System.out.println("Select The Option");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exits");

        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt(); 

        if(option==1){
            checkBalance() ;
        }else if(option == 2){
            withdrawMoney();
        }else if(option ==3){
            depositeMoney();
        }else if(option ==4){
          //  break;
          return;
        }else{
            System.out.println("enter the Valid Option");
        }
    }

    public void checkBalance() throws InterruptedException{
        System.out.println("A/c Balance is ="+balance);
        Thread.sleep(800);
        menu();
    }

    public void withdrawMoney() throws InterruptedException{
        System.out.println("Enter the withdraw Amount");
        Scanner sc = new Scanner(System.in);
         float amount = sc.nextFloat();
         if(amount > balance){
            System.out.println("Insufficent fund");
         }else {
            balance =   balance - amount;
         }
         Thread.sleep(800);
         menu();
    }

    public void depositeMoney() throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter deposite Money Amount");
        int amount = sc.nextInt();
        balance = balance + amount;
        Thread.sleep(800);
        menu();
    }

    

}

public class ATM_Machine  {
    public static void main(String[] args)  throws InterruptedException {
       ATM obj = new ATM(); 

       obj.checkPin();
    }
}
