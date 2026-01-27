public class binarysearch {
    public static int binarysearch(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid]==key) {
                return mid;
            }else if(arr[mid]<key){
               return start= mid+1;
            }else {
               return end= mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int key = 10;
        int arr[] = {2,4,5,10,23, 49, 120};
        
        System.out.println(binarysearch(arr, key));
        
    }
}
