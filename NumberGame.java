import java.util.Random;
import java.util.Scanner;
class NumberGame {
    public static void main(String[] args) {
  
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a random number between 1 and 100. Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < randomNumber) {
                System.out.println("Try a higher number.");
            } else if (userGuess > randomNumber) {
                System.out.println("Try a lower number.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + numberOfTries + " tries.");
            }
        }

        scanner.close();
        }
}