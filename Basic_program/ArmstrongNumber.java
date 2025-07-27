public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 371123;
        int temp = num;
        int temp_2 = num;
        int count = 0;
        while(temp>0){
            temp = temp/10;
            count++;
        }
           // check Number is Armstrong or not
        int result = 0;
        while(temp_2 >0){
            int no = temp_2%10;
            temp_2 =  temp_2 /10;
            int sqrt = 1;
            for(int i = 1;i<=count;i++){
              sqrt *= no;
            }
            result +=sqrt;
        }
        System.out.println("result= "+result);
        System.out.println("number="+num);
        if(result == num){
            System.out.println("No is Armstrong");
        }else{
            System.out.println("No. is Not ArmStrong");
        }
      
    }
}
