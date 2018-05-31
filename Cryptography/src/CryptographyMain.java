import java.util.Scanner;

public class CryptographyMain {
    public static void main(String[] args) {
        String encryptedCode = "the cat in the hat!";
        Cryptography cryptoTool = new Cryptography();
        int currentIndex = 0;
        while (currentIndex < encryptedCode.length()) {
            char letter = encryptedCode.charAt(currentIndex);
            if ((letter >= 'A') && (letter <= 'Z')) {
                System.out.print(cryptoTool.applyRotation(letter));
            } else {
                System.out.print(letter);
            }
            currentIndex = currentIndex + 1;
        }
    }
}
