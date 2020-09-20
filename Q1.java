import java.util.Arrays;

public class Q1 {

    public static void main(String[] args) {

        // solution: {88, 70, 96, 38, 47, 1, 5, 51, 7, 3, 11}
        int[] arr = {51, 7, 87, 3, 11, 71, 95, 31, 41, 1, 5};
        int numOdds = 0;

        // Check for number of odd nums first
        for (int i=0; i<arr.length; i++) {
            if (arr[i]%2 == 1) numOdds++;
        }

        // If all odd, end program
        if (numOdds == arr.length-1) {
            System.out.println(Arrays.toString(arr));
            System.exit(0);
        }

        for (int i=0; i<arr.length-numOdds; i++) {
            System.out.println(arr[i]);
            if (arr[i]%2 == 1) {
                int num = arr[i];
                for (int j=i; j<arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                arr[arr.length-1] = num;
                i--;
                System.out.println(Arrays.toString(arr));
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
