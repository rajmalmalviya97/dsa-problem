import java.util.Arrays;

public class StringsProgram {
    public static void main(String[] args) {
        String str = "Yes this is testing for string for the developemnt and testing";
        String str_two = "    ";
        int length = str.length();
        char characterAtIndex = str.charAt(12);
        String[] split = str.split("for");

        // System.out.println("length = "+length);
        // System.out.println("Empty = "+str_two.isEmpty());

        // System.out.println("Character Index = "+characterAtIndex);

        // System.out.println("Split the array="+Arrays.toString(split));

        // Compare String OR Equals

        // String str_comp = "Learn Java";
        // String str2_comp = "Learn Php";
        // boolean result ;
        // // result = str_comp.compareToIgnoreCase(str2_comp);
        // result = str_comp.equals(str2_comp);

        // System.out.println("compare result "+result);

        // String Replace Code...
        String str1 = "bat ball";

        // replace b with c
        System.out.println(str1.replace("bat", "Football"));

        // Contain In string

        String str_contain = "Java & Php String contains()";

        boolean result = str_contain.contains("Php");
        System.out.println("contain " + result);

        System.out.println();
    }
}
