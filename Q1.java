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

        int num = 0;
        for (int i=0; i<arr.length-numOdds; i++) {
            if (arr[i]%2 == 1) {
                num = arr[i];
                for (int j=i; j<arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                arr[arr.length-1] = num;
                i--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
