package exercise6;

import java.util.Scanner;

public class Hangmann {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] words = {"Fiki", "Malina", "Azis"};
        int maxErrors = 5;

        boolean playAgain = true;
        do {
          int randomIndex = new Random().nextInt(words.length);
          String word = words[randomIndex]; 

          char [] enteredLetters = 

        System.out.println("Do you want to play again (y/n): ");
        char yesOrno = input.next().charAt(0);
        if (yesOrno == 'n') {
          playAgain = false;

        }


      } while(playAgain);

        System.out.println("Session end");


    }
}
