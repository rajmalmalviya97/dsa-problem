public class TableWithOrWithoutLoop {
    public static void main(String[] args) {
        //print table with n number

        int num = 15;

        // for(int i = 5; i<=num ; i++){
        //     for(int j = 1; j<=10; j++){
        //         System.out.println(i*j);
        //       //  System.out.println();
        //     }
        //     System.out.println();
        // }


        //Print Table Without Loop
        int numberT = 11;
        printTable(numberT);
    }
    
    public static void printTable(int num){
       for(int i =1 ;i<=10;i++){
        System.out.println(num*i);
       }
    }

}
