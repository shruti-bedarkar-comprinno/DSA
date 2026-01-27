import java.util.*;
public class linerser {
    public static void update(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            arr[i]= arr[i] +1;
        }
    } 
    public static void main(String args[]) {
        int arr[] = new int[2];
        Scanner sc = new Scanner(System.in);
           for(int i=0;i<arr.length;i++) {
            arr[i]= sc.nextInt();
           }
           update(arr);
           System.out.println("the update version will be :");
           for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i] + " ");
           }
    }
}
