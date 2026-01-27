public class MaxIn2D {
    public static int MaxI2D(int arr[][]) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String args[]) {

        int arr[][] = {
            {3 , 6 ,8,0},
            {4,6,3,2,1},
            {2,4,5,7,8}
        };
        System.out.println(MaxI2D(arr));
    }
}
