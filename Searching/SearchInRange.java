

public class SearchInRange {
    public static int serachrange(int arr[], int target, int start, int end) {
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]= {2,4,6,8,10};
        int target=11;
        System.out.println(serachrange(arr,target,1,3));
    }
}
