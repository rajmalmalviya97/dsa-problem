public class PrimeNoFromArray {
    public static void main(String[] args) {
        int arr[] = { 55,44,77,11,5,41,28,100,50,99};

        //Select Prime No. From The Given Array
        for(int i =0;i<=arr.length;i++){
            if(arr[i] <1){
                return false;
            }
            if(arr[i] ==2){
                return false;
            }

          for (int j = 2; i <= Math.sqrt(arr[i]); j++) {
            if (arr[i] % i == 0)
                return false;
        }
        System.out.println("number=="+arr[i]);
        }
    }
}
