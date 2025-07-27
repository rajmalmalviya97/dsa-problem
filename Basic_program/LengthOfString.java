public class LengthOfString {
    public static void main(String[] args) {
        String str= "KAMLESH GUJJAR";
        int count =0;

        for(int i = 0;;i++){
            char charValue = str.charAt(i);
            if(charValue !=' '){
                count++;
            }else{
                break;
            }
        }
        System.out.println("Length of string without length function ="+count);
    }
}
