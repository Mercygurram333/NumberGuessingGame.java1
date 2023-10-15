import java.util.*;
public class NumberGuessingGame
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int roundsPlayed = 0;
        int roundsWon = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between " + minRange + " and " + maxRange + ".");
        while (true)
        {
            int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            while(attempts < maxAttempts)
            {
                System.out.print("Enter Your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                if(userGuess == numberToGuess)
                {
                    System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + attempts + "attempts.");
                    roundsWon++;
                    roundsPlayed++;
                    System.out.println("Do you want to play again (yes/no):");
                    String playAgain = scanner.next().toLowerCase();
                    if(playAgain.equals("no"))
                    {
                        scanner.close();
                        System.out.println("Thanks for playing!");
                        System.out.println("Rounds played:" + roundsPlayed);
                        System.out.println("Rounds won:" + roundsWon);
                        return;


                    }
                    break;
                }
                else if (attempts >= maxAttempts)
                {
                    System.out.println("Sorry,you've reached the maximum number of attempts. The correct number was  " + numberToGuess + ".");
                    roundsPlayed++;
                    System.out.println("Do you want play again (yes/no):");
                    String playAgain = scanner.next().toLowerCase();
                    if (playAgain.equals("no"))
                    {
                        scanner.close();
                        System.out.println("Thanks for playing!");
                        System.out.println("Rounds played" + roundsPlayed);
                        System.out.println("RoundsWon:" +roundsWon);
                        return;
                    }
                    break;
                }
                else{
                    if(userGuess < numberToGuess)
                    {
                        System.out.println("Try a higher number.");

                    }
                    else{
                        System.out.println("Try a lower number.");
                    }

                }

            }

        }
        

    }
}