import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RationalConsole {
    // a regular expression to match a rational number, such as 410 / 16
    private static String rationalPattern = "(\\d+)[ /]+(\\d+)";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many? ");
        int howmany = new Scanner(in.readLine()).nextInt();

        // array that will contain user-provided rational numbers
        Rational[] rationals = new Rational[howmany];

        for (int i=0; i<howmany; i++) {
            System.out.println("Enter a rational:");
            String line = in.readLine();
            Scanner s = new Scanner(line);
            if (!s.hasNext(rationalPattern)) {
                throw new RuntimeException("not a rational number (format is n / d)");
            } else {
                s.findInLine(rationalPattern);

                int num = Integer.parseInt(s.match().group(1));
                int den = Integer.parseInt(s.match().group(2));

                // CODE HERE: add the new rational number to the array
            }
        }

        // CODE HERE: sum up all the rationals in the array and print the sum (also a rational)
    }
}
