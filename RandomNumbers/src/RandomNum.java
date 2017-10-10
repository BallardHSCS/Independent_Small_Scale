import java.util.Random;
public class RandomNum {

    public static final int NUM_NUMBERS_TO_CHOOSE= 3;
    public static final int MAX_RANDOM_NUMBER = 50;

    public static void main(String args[]){

        //kindly gives nerds their RNG fix
        System.out.println("Here are your " + NUM_NUMBERS_TO_CHOOSE * 2 + " random numbers");


        //Uses Math.random
        for (int i = 0; i < NUM_NUMBERS_TO_CHOOSE; i++){
            int randomNumber = (int)(Math.random() * MAX_RANDOM_NUMBER + 1);
            System.out.println(randomNumber);





        }

        //uses random class to create 3 numbers
        Random randomIntGenerator = new Random();

        for(int i = 0; i < NUM_NUMBERS_TO_CHOOSE; i++){
            int randomNumber = randomIntGenerator.nextInt(MAX_RANDOM_NUMBER +1);
            System.out.println(randomNumber);


        }











    }






}
