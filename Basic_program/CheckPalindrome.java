public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "ABCZCBAAAAAAAa";
        int num =12333214;
        boolean result =  checkPali(str);
        String message = checkNumPallindrom(num);
        System.out.println(message);
        if(result){
            System.out.println("String is Palindrom");
        }else{
            System.out.println("String is not palindrom");
        }
        // for(int i = 1; i< str.length();i++){
        //     if(str.charAt(i) == str.charAt(str.length()-i)){
        //         return false;
        //     }
        //     if(i==str.length()-i){
        //         return true;
        //     }
        // }
    }

     static Boolean checkPali(String str){
        for(int i = 1; i< str.length();i++){
            if(str.charAt(i) == str.charAt(str.length()-i)){
                return false;
            }
            if(i==str.length()-i){
                return true;
            }
        }
        return true;
    }

    static String checkNumPallindrom(int num){
        int rev = 0 ;
        int actualNumber = num;
        while(num>0){
       int  number = num%10;
       rev = rev*10 +number;
      num = num/10;
        }
        if(rev == actualNumber){
            return "Number is Palindrome";
        }else{
            return "Number is not Palindrome";
        }
        
    }
}
