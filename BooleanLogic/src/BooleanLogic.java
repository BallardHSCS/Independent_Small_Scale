/**
 * Created by katemaroney on 11/10/15.
 */
public class BooleanLogic {

    public static void main(String[] args){
        int score = 0;
        /*
        Part one - testing boolean logic
        Supply the input to make the each of the following if statements print "Winner
        The methods that you are looking for are near the bottom of the class.
        Uncomment as you go to test this.
         */

        if (inputOne(false,true,false,true)){
            System.out.println("Winner!");
            score++;
        }
        else {
            System.out.println("Try again");
        }



        if(inputTwo(false, true,true,true)){
            System.out.println("Winner!");
            score++;
        }
        else{
            System.out.println("Try again");
        }



        if (inputThree(false,true, false,true)){
            System.out.println("Winner!");
            score++;
        }
        else{
            System.out.println("Try again");
        }



        if (inputFour(false, false, true, true)){
            System.out.println("Winner!");
            score++;
        }
        else{
            System.out.println("Try again");
        }



        /*
        Part Two - Creating boolean logic

        Given the following inputs, fill out the code for the given methods.
        You are required to use AT LEAST 6 operators (&&, || or !) and all parameters/inputs
        The methods that you are looking for are near the bottom of the class.
         */

        if (outputOne(false, false, false, false)){
            System.out.println("Winner!");
            score++;
        }
        else{
            System.out.println("Try again");
        }
        if (outputTwo(false, false, true, true)){
            System.out.println("Winner!");
            score++;
        }
        else{
            System.out.println("Try again");
        }
        if (outputThree(true, true, true, false)){
            System.out.println("Winner!");
            score++;
        }
        else{
            System.out.println("Try again");
        }
        if (outputFour(false, true, false, true)){
            System.out.println("Winner!");
            score++;
        }
        else{
            System.out.println("Try again");
        }

        /*
        Part three - correct the error!
        Make sure to change only the left side of the equation
         */

        if ((true && true) == true){
            System.out.println("Winner");
            score++;
        }
        else{
            System.out.println("This statement should be true...");
        }
        if ((true && true) == true){
            System.out.println("Winner");
            score++;
        }
        else{
            System.out.println("This statement should be true...");
        }
        if ((true && false) == false){
            System.out.println("Winner");
            score++;
        }
        else{
            System.out.println("This statement should be true...");
        }
        if (((true && false) || false) == false){
            System.out.println("Winner");
            score++;
        }
        else{
            System.out.println("This statement should be true....");
        }

        System.out.println("Score: " + score + "/12");
    }

    public static boolean inputOne(boolean one, boolean two, boolean three, boolean four){
        if ((one && two && !three) || (four && (two || three) && two ) || (one && three)){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean inputTwo(boolean one, boolean two, boolean three, boolean four){
        if (two || (three && four && !one) && (two || !two) || (one || (four && !three))){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean inputThree(boolean one, boolean two, boolean three, boolean four){
        if ((two && (!three || four)) || (four && !one) && two){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean inputFour(boolean one, boolean two, boolean three, boolean four){
        if (!one && (three || !two) && (!three ||four) && (two || three)){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean outputOne(boolean one, boolean two, boolean three, boolean four){

        // replace this with a boolean statement that is true when receiving the values from above
        return true;
    }
    public static boolean outputTwo(boolean one, boolean two, boolean three, boolean four){

        // replace this with a boolean statement that is true when receiving the values from above
        return true;
    }

    public static boolean outputThree(boolean one, boolean two, boolean three, boolean four){

        // replace this with a boolean statement that is true when receiving the values from above
        return true;
    }

    public static boolean outputFour(boolean one, boolean two, boolean three, boolean four){
        
        // replace this with a boolean statement that is true when receiving the values from above
        return true;
    }
}
