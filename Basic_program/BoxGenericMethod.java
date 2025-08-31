public class BoxGenericMethod {
    public static void main(String[] args) {
        Integer array[] ={45,44,14,10,22,63};
        String string_a[]= {"Audi", "Mahindra","Car","Xuv"};
        printArray(array);
        printArray(string_a);
        
    }

    public static <T> void printArray(T[] data){
        for(T row : data){
           System.out.println(row);
        }
    }
}
