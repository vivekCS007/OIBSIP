import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();//for gerating random number
        int randomnumber;
        int maxAttempts = 10;//max number of attempts
        int score = 0;//score

        Scanner scanner = new Scanner(System.in);//for taking user inout

        System.out.println("Welcome to the Number Guessing Game!");

        boolean play_once_more;
        do {
            randomnumber = random.nextInt(99) + 1;
            int attempts = 0;
            boolean correctguess = false;

            System.out.println("\nI have chosen a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guessedNumber = scanner.nextInt();
                attempts++;

                if (guessedNumber == randomnumber) {
                    score =110-attempts*10;//to give score out of 100
                    System.out.println("Congratulations! You guessed "+randomnumber +" in " + attempts + " attempts.");
                    correctguess = true;
                    break;
                } else if (guessedNumber < randomnumber) {
                    System.out.println("your guess is so small.");
                } else {
                    System.out.println("your guess is too big.");
                }
            }

            if (!correctguess) {
                System.out.println("Your attempts ends here. The number was " + randomnumber + ".");
            }

            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play once more? (y/n): ");
            String play_once_moreChoice = scanner.next().toLowerCase();
            play_once_more = play_once_moreChoice.equals("y");
        } while (play_once_more);

        scanner.close();
    }
}
