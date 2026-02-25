public class EvenDigits {

    public static int evenDigits(int arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int digits = countDigits(arr[i]);

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

   
    public static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }

        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {12, 345, 2, 6, 7896};

        int result = evenDigits(arr);

        System.out.println("Numbers with even digits: " + result);
    }
}
