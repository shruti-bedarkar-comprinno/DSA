public class largerst {
public static int largests(int arr[]) {
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++) {
        if(arr[i] > largest){
            largest = arr[i];
        }
    }
    for(int i=0;i<arr.length;i++) {
        if(arr[i]<smallest){
            smallest = arr[i];
        }
    }
    System.out.println("smallerst will be:" + smallest);
    return largest;
}




public static void main(String args[] ){

int arr[] ={ 2,4,5,6,8,10};
System.out.println("largest will be:" + largests(arr));





    }
}
