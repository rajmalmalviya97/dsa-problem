public class ReverseTheString {
    public static void main(String[] args) {
        String str = "ABCDEFG";
        String result ="";
        System.out.println(str.length());

        for(int i =str.length(); i>0 ; i--){
          char ch = str.charAt(i-1);
          result = result + ch;
        }
        System.out.println("result  ="+result);
    }
}
