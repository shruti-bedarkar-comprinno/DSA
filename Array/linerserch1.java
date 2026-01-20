public class linerserch1 {
    // public static int search(int arr[], int index) {
    //      for(int i=0;i<arr.length;i++) {
    //         if(arr[i]==index) {
    //             return i;
    //         }
    // }
    // return -1;

// }
    public static void main(String args[]) {
        // int index = 10;
        // int arr[] = {2,3,5,7,8,10,30};
        // int index1 =search(arr,index);
        // if(index1 == -1){
        //     System.out.println("NOT FOUND");
        // }else{
        //     System.out.println("index will be:" + index1);
        // }
        String str = "shruti";
        String s[] = {"raj" , "kishor","aditya","shruti"};
        for(int i=0;i<s.length;i++) {
            if(s[i].equals(str)) {
                System.out.print(i);
            }
        }
        
        }
    }

