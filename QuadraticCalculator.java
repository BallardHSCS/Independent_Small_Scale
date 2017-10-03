import java.util.Scanner;

/**
 * Created by
 */
public class QuadraticCalculator {

    public static void main(String args[]) {

        boolean done = false;
        Scanner inputScanner = new Scanner(System.in);

        while (!done) {

            // enter code to get the information for the equation here
            System.out.println("Please enter the three numbers you want to solve for a, b and c of a quadratic equation:");
            System.out.println("(enter all numbers with spaces, or enter quit to stop the program)");

            // if the first input is a string, then make sure it is time to quit
            if () {

            }
            // otherwise check to see if it is something we can use, if so grab the rest of the data
            else if () {


                // do quadratic calculation and output possible answers (there are two)
            }
            // it it is none of the above, it is probably invalid input
            else {
                inputScanner.next();
            }
        }

        // we should always clean up after ourselves! Close the scanner object
        inputScanner.close();
        System.out.println("Goodbye!");
    }
}
