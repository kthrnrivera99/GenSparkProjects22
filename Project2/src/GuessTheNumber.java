import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {

        // take username
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! My name is Katherine. \n What is your name?");
        String name = sc.next();

        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20, you have 6 tries. \nTake a guess.");

        // generate random number between 1 - 20 (inclusive)
        Random rand = new Random();
        int random = rand.nextInt(20 - 1 + 1) + 1;

        // number of guesses
        int k = 6;

        // initialize starting condition for loop
        int i;

        // user input
        int guess;

        // for loop to check if guess number matches random number
        for (i = 0; i < k; i++) {
            // take user input
            guess = sc.nextInt();

            if (random == guess) {
                System.out.println("Good job, " + name + " You guessed my number in " + i + " guesses!");
                System.out.println("Would you like to play again (y or n) ?");


            } else{
                if (random > guess && i != k - 1) {
                    System.out.println("Your guess is too low, try again");
                } else if (random < guess && i != k - 1) {
                    System.out.println("Your guess is too high, try again");
                    }
            }
        }

        if (i == k) {
            System.out.println("You ran out of guesses.");
            System.out.println("The number I was thinking of was " + random);
            System.out.println("Would you like to play again (y or n) ?");
            }
        }
    }
