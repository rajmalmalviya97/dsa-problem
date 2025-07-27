public class FindLargest {
    public static void main(String[] args) {
        int arr[] = { 44,77,54,100,25,65,547,41,77,86};
        int largest=0 ;
        for(int i=0;i<arr.length ; i++){
          //  System.out.println("value = "+arr[i]);
            if(arr[i] > largest){
             largest = arr[i];

            }
        }
        System.out.println("Largest Element = "+largest);
    }
}
