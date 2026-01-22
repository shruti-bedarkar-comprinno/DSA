public class Printmin {
    //direct value
    public static void min(int arr[]) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<min){
             min = arr[i];
            }
        }
        System.out.println(min);
    }
//print index
public static int min2(int arr[]) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]<min){
            return i;
        }
    }
    return -1;
}
    public static void main(String[] args) {
       int arr[] = {4,5,6,7,8,10,1};
    //    min(arr);
       System.out.println(min2(arr));
    }

}
