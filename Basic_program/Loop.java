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
              //  System.out.println("*** ** **** ");
             }
            index++;
        }

        int numbers[]= {44,10,12,54,7,8,88,42,63};
       // printNumber(numbers);

        int d= 2+3*4;
        System.out.println("D value "+d);
    }

    protected void printLine(int lineno){
        for(int i=0;i<lineno;i++){
            System.out.println("* * * ** ");
        }
    }


    public static void printNumber(int numbers[]){
        for(int num :numbers){
            System.out.println(num);
        }
    }
}
