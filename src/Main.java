import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean playAgain = true;

    while(playAgain) {
      String word = RandomWord.getWord();
      int wrongGuesses = 0;
      char guess;

      ArrayList<Character> wordState = new ArrayList<>();


      System.out.println("----------------------------");
      System.out.println("  Welcome to CLI Hangman!");
      System.out.println("----------------------------");
      System.out.println();

      for (int i = 0; i < word.length(); i++) {
        wordState.add(i, '_');
      }


      while (wrongGuesses < 6) {
        try {
          for (Character character : wordState) {
            System.out.print(character + " ");
          }

          if (!wordState.contains('_')) {
            System.out.println();
            System.out.println("You Win!");
            break;
          }
          System.out.println();
          System.out.print("Enter your guess : ");
          guess = Character.toLowerCase(scanner.nextLine().charAt(0));


          if (word.indexOf(guess) != -1) {
            System.out.println("Correct Guess!");
            System.out.println(Art.getArt(wrongGuesses));
            for (int i = 0; i < wordState.size(); i++) {
              if (word.charAt(i) == guess) {
                wordState.set(i, guess);
              }
            }

          } else {
            System.out.println("Incorrect Guess!");
            wrongGuesses++;
            System.out.println(Art.getArt(wrongGuesses));

          }

        } catch (InputMismatchException e) {
          System.out.println("Input Mismatch Error");
        } catch (Exception e) {
          System.out.println("Something went wrong");
        }

      }
      if (wrongGuesses >= 6) {
        System.out.println("You loose!");
        System.out.println("The word was : " + word);
      }

      System.out.print("Play again? (y/n): ");
      String again = scanner.nextLine().trim().toLowerCase();
      playAgain = again.equalsIgnoreCase("y");
      System.out.println();

    }



  }

}