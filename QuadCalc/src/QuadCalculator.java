import java.util.Scanner;

public class QuadCalculator {

    public static void main(String args[]) {

        boolean done = false;
        Scanner inputScanner = new Scanner(System.in);

        while (!done) {

            // enter code to get the information for the equation here
            System.out.println("Please enter the three numbers you want to solve for a, b and c of a quadratic equation:");
            System.out.println("(enter all numbers with spaces, or enter quit to stop the program)");

            // if the first input is a string, then make sure it is time to quit
            if (inputScanner.hasNext("quit")) {
                done = true;
            }
            // otherwise check to see if it is something we can use, if so grab the rest of the data
            else if (inputScanner.hasNextDouble()) {
                double a = inputScanner.nextDouble();
                double b = inputScanner.nextDouble();
                double c = inputScanner.nextDouble();
                double answ1 = ((-b) + Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
                double answ2 = ((-b) - Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
                System.out.println("x = " + answ1);
                System.out.println("x = " + answ2);
            }

            // do quadratic calculation and output possible answers (there are two)

            // it it is none of the above, it is probably invalid input
            else {
                inputScanner.next();
                System.out.println("Not a valid output bro!");
            }


            // we should always clean up after ourselves! Close the scanner object


        }
        inputScanner.close();
        System.out.println("Goodbye!");
    }}