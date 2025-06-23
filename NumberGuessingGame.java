import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the number Guessing Game!");
        System.out.println("I have chosen a number 1 and 100. Try to guess it!");

        while (guess != randomNumber)
        {
            System.out.println("Enter your guess:");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber)
            {
                System.out.println("Too Low! Try again.");
            }
            else if (guess > randomNumber)
            {
                System.out.println("Too high! Try again.");
            }
            else
            {
                  System.out.println("Congratulations! You gussed the number" + randomNumber + " in " + attempts + "attempts.");
            }
        }
        scanner.close();
    }
}