package Hangman;
import java.util.Random;


public class Hangman {
    public static void main(String[] args) {
        String[] strArray = {"javascript", "python","java", "kotlin"};
        System.out.println("HANGMAN "+ "\nYou guess the word:");
        getRandomWord(strArray);
    }

    static String getRandomWord(String[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);

        if (index == 0) {
        } else {
            System.out.println("You lost!");
        }
        return null;

    }
        }
