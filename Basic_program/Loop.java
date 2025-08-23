public class Loop {
    public static void main(String[] args){
        int arr[] = {10,44,12,55,23,64};
        // FOR Loop
        for(int i= 0; i<arr.length ;i++){
            System.out.println("value ="+arr[i]);
        }
 
        String cities[] = {"Indore", "Bhopal","Pune","Delhi","Pune","Banglore","Goa"};
        //FOR-each Loop
        //Index 
        int index = 0;
        for(String city :cities){  
            System.out.println(city);
             if(index>2){
                System.out.println("*** ** **** ");
             }
            index++;
        }
    }
}
