

import java.util.*;
public class twod {
    public static boolean search(int arr[][], int key) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key) {
                    System.out.println("index:" + "(" + i + "," + j +")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void saj(int arr[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
                if(arr[i][j]<smallest){
                    smallest = arr[i][j];
                }
            }
        }
        System.out.println("largest:" + largest);
        System.out.println("smallest:"+ smallest);


    }
    public static void main(String args[]) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        //print
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int key = 5;
        System.out.println(search(arr,key));
        saj(arr);

    }
}
