public class GCM {
    public static void main(String[] args) {
        int  num1 =45; 
        int num2 =25;
        
        int num_1_original = num1;
        int num_2_original = num2;

        while (num1 % num2 !=0){
            int rem = num1 %num2;
            num1 = num2;
            num2= rem;  
        }

        int greatestCommonF = num2;
        int lcm = (num_1_original * num_2_original) /greatestCommonF;
        System.out.println("Greatest common F "+greatestCommonF);
        System.out.println("LCM = "+lcm);
    }
}
