import java.util.Random;

public class DiceRoll {
	public static final int NUM_ROLLS = 1000;
	public static final int NUM_OUTCOME = 11;
	public static void main(String[] args) {
		int[] array = new int[NUM_OUTCOME];
		for(int i = 0; i < NUM_OUTCOME; i++){
			array[i]= 0; }
		// Store counts of the six possible values
		Random randGen = new Random();

		for(int i = 0; i < NUM_ROLLS; i++){
			int rolledNum = randGen.nextInt(6);
			int rolledNum2 = randGen.nextInt(6);
			int dicedub = rolledNum + rolledNum2;
			array[dicedub]++;
			//TODO: Make the rolled num add two values that fall within range
		}
		for(int i=0; i< NUM_OUTCOME; i++){
			System.out.print("Number of " + (i + 2) + "s:" + array[i]);
			System.out.println(" - The probability to get this number with two dice is: " + (array[i]/10 + "%"));
		}
	}
}
