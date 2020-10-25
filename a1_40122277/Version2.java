import java.io.*;
import java.util.*;
import java.lang.Math;

public class Version2 {

    public static void main(String[] args) {
        // Ask the user to input a random string with a random amount of masks
        System.out.print("Input random string with masks: ");
        String begin = new Scanner(System.in).next();

        System.out.println(begin);

        try {
            // Open out.txt for printing
            PrintWriter p = new PrintWriter(new FileOutputStream("outv2.txt"));

            // Save the start time of the method
            long startTime = System.currentTimeMillis();
            RevealStr(begin, p);
            // Save the end time of the method
            long endTime = System.currentTimeMillis();

            // Close the file
            p.close();

            // Open time.txt file and print elapsed time to it
            p = new PrintWriter(new FileOutputStream("timev2.txt", true));
            p.println("Elapsed time: " + (endTime - startTime)/1000. + " seconds.");
            p.close();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /*
    * This method uses a stack to find all possible compbinations of the string, then
    * prints it to a file
    * @param String s a string of 1s, 0s, and masks, PrintWriter p to print to file
    * @return void
    */
    public static void RevealStr(String s, PrintWriter p) {
        // New stack to hold the strings
        Stack<String> stack = new Stack<String>();
        // Push input string to the stack
        stack.push(s);

        int index = 0;
        // While the stack is not empty, pop the top element and save it in result
        while(!stack.empty()) {
            String result = stack.pop();

            // If there is a mask in the string save that index in variable index
            if (result.indexOf('*') != -1) {
                index = result.indexOf('*');
                // Alternating between 0 and 1, create new strings and push it to the stack
                for (int num=0; num<=1; num++) {
                    result = result.substring(0, index) + num + result.substring(index+1);
                    stack.push(result);
                }
            }
            // If there are no masks in the string, print to file
            else {
                p.print(result + "\n");
            }
        }
    }

}
