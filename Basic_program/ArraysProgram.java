import java.util.Arrays;

public class ArraysProgram {
    public static void main(String[] args) {
        
        int arr[] = { 44,10,25,102,19,98,77};
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.asList(arr));

     //   Arrays.sort(arr);
          Arrays.sort(arr ,3,7);

        System.out.println("Array after sort"+Arrays.toString(arr));


        //Compare Two Arrays
        String[] cars = {"Volvo 1", "BMW", "Tesla"};
        String[] cars2 = {"Volvo", "BMW", "Tesla"};

        System.out.println(Arrays.compare(cars, cars2)); 


        String fruits[] ={ "Apple", "Banana","Mango","tomato","Gavava","Black Jamun"};
        // Arrays.fill(fruits,"Grapes");
        Arrays.fill(fruits,2,4,"Kiwi");
         System.out.println(Arrays.toString(fruits));

        


    }
}
