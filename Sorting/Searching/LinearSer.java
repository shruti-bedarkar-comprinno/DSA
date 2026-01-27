class LinearSer {
    public static int search1(int arr[], int target) {
        int index = 0;
        for(int value: arr){
                if(value == target) {
                    return index; 
                }
                index++;
        }
        return -1;
    }
    public static boolean search2(int arr[], int target) {

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public static int search3(int arr[], int target) {
        if(arr.length== 0) return -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String args[]) {
       int arr[] = {2,5,7,8,9,10};
       int target = 9;
    //    System.out.println(search1(arr, target));
        // System.out.println(search2(arr, target));
        System.out.println(search3(arr, target));
    }
}