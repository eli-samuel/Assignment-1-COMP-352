import java.util.Arrays;

public class Q2 {

    public static void main(String[] args) {

        int[] arr = {42, 21, 10, 31, 7};

        int firstMax = arr[0];
        int secondMax = arr[1];
        int maxIndex1 = 0, maxIndex2 = 1;

        int firstMin = arr[0];
        int secondMin = arr[1];
        int minIndex1 = 0, minIndex2 = 1;

        for (int i=1; i<arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];

                maxIndex2 = maxIndex1;
                maxIndex1 = i;
            }
            else if (arr[i] > secondMax) {
                secondMax = arr[i];
                maxIndex2 = i;
            }

            if (arr[i] < firstMin) {
                secondMin = firstMin;
                firstMin = arr[i];

                minIndex2 = minIndex1;
                minIndex1 = i;
            }
            else if (arr[i] < secondMin) {
                secondMin = arr[i];
                minIndex2 = i;
            }
        }

        System.out.println("The two indices with largest product between their values are:\n"
                    + "\tindex " + maxIndex1 + " and index " + maxIndex2 + ", storing values "
                    + firstMax + " and " + secondMax + ", and the value of their product"
                    + "is " + (firstMax * secondMax) + ".");

        System.out.println("The two indices with smallest product between their values are:\n"
                    + "\tindex " + minIndex1 + " and index " + minIndex2 + ", storing values "
                    + firstMin + " and " + secondMin + ", and the value of their product"
                    + "is " + (firstMin * secondMin) + ".");
    }

}
