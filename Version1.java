import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class Version1 {

    public static void main(String[] args) {
        // Ask the user to input a random string with a random amount of masks
        System.out.print("Input random string with masks: ");
        String begin = new Scanner(System.in).next();

        System.out.println(begin);
        begin = "";

        try {
            for (int i=0; i<=25; i++) {
                begin += "*";
                // Open out.txt for printing
                PrintWriter p = new PrintWriter(new FileOutputStream("out.txt"));

                // Save the start time of the method
                long startTime = System.currentTimeMillis();
                RevealStr(begin, p);
                // Save the end time of the method
                long endTime = System.currentTimeMillis();

                // Close the file
                p.close();

                // Open time.txt file and print elapsed time to it
                p = new PrintWriter(new FileOutputStream("time.txt", true));
                p.println("Elapsed time with " + i + " masks: " + (endTime - startTime)/1000. + " seconds.");
                p.close();
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * This method uses recursion to find all possible compbinations of the string, then
     * prints it to a file
     * @param String s a string of 1s, 0s, and masks, PrintWriter p to print to file
     * @return void
     */
    public static void RevealStr(String s, PrintWriter p) {
        // Change string to array of strings by characters
        String[] arr = s.split("");
        String newStr = "";
        boolean star = false;

        for (int i=0; i<arr.length; i++) {
            // Check to see if that element is a mask
            if (arr[i].equals("*")) {
                star = true;
                newStr = "";
                // Replace the mask with a 1, keep the rest of the string the same
                for (int j=0; j<arr.length; j++) {
                    if (i == j) newStr += 1;
                    else newStr += arr[j];
                }

                // Call recursively on the updated number
                RevealStr(newStr, p);

                newStr = "";
                // Replace the mask with a 0, keep the rest of the string the same
                for (int j=0; j<arr.length; j++) {
                    if (i == j) newStr += 0;
                    else newStr += arr[j];
                }

                // Call recursively on the updated number
                RevealStr(newStr, p);
                return;
            }

            // If there are no more masks in the number and the program has looped over the entire
            // string, print that string to the file.
            if (!star && i == arr.length-1) {
                String print = "";
                for (int j=0; j<arr.length; j++) print += arr[j];
                p.print(print + "\n");
            }
        }
    }
}
