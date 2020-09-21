import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class Version1 {

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        String begin = "";
        for (int i=0; i<num; i++) {
            begin += "*";
        }
        System.out.println(begin);

        long startTime = 0, endTime = 0;
        try {
            PrintWriter p = new PrintWriter(new FileOutputStream("out.txt"));

            startTime = System.currentTimeMillis();
            RevealStr(begin, p);
            endTime = System.currentTimeMillis();

            p.close();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println((endTime - startTime)/1000. + " seconds.");
    }

    public static void RevealStr(String s, PrintWriter p) {
        // Change to array of chars
        String[] arr = s.split("");

        String newStr = "";
        boolean star = false;
        for (int i=0; i<arr.length; i++) {
            if (arr[i].equals("*")) {
                star = true;
                // Replace a star with a 1
                newStr = "";
                for (int j=0; j<arr.length; j++) {
                    if(i == j) newStr += 1;
                    else newStr += arr[j];
                }
                // Call recursively on new number
                RevealStr(newStr, p);

                // Replace star with a 0
                newStr = "";
                for (int j=0; j<arr.length; j++) {
                    if(i == j) newStr += 0;
                    else newStr += arr[j];
                }
                // Call recursively on new number
                RevealStr(newStr, p);
                break;
            }

            if (!star && i == arr.length-1) p.print(Arrays.toString(arr) + "\n");
        }
    }
}
