public class printsubarr {

    public static void printsubarr(int arr[]) {

        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                int sum = 0;

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }

                System.out.println(" | sum = " + sum);
                ts++;

                if (sum > maxSum) maxSum = sum;
                if (sum < minSum) minSum = sum;
            }
            System.out.println();
        }

        System.out.println("total subarrays: " + ts);
        System.out.println("max sum: " + maxSum);
        System.out.println("min sum: " + minSum);
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10};
        printsubarr(arr);
    }
}

