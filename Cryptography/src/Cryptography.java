import java.lang.Character;

public class Cryptography
{
    private int rotation = 13;  // used in the second part
    private int alphabet = 26;
    private int letterA = 'A';
    public Cryptography()
    {
        // no need to put anything here for now.
    }

    public int convertToNumbers(char letter)
    {
        int thisChar = letter- letterA;


        // fill in this method!
        return thisChar;
    }
public char applyRotation(char letter){

    int rotatedLetter = (convertToNumbers(letter) + rotation)%alphabet;
    char newcharacter = (char) (rotatedLetter + letterA);
    return newcharacter;
}
    // create a similar method for the ROT13 portion.
    // This method will return a character instead.

}
