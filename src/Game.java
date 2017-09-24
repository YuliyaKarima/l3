import java.util.Scanner;

/**
 * Class that simulates a game in guessing the number by user
 */
public class Game {
    //a number that user has to guess
    private int number;
    //begin of the range in which the number is located
    private int rangeBegin;
    //end of the range in which the number is located
    private int rangeEnd;

    public static void main(String[] args) {
        //creating object of class Game
        Game game = new Game();
        //starting game
        game.startGame();
    }

    /**
     * In this method a user enters two number to define a range in which a number will be thought.
     */
    public void startGame() {
        //offer for user to enter two numbers
        System.out.println("Enter two number - number range: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("First number: ");
        int numBegin = sc.nextInt();
        System.out.println("Last number: ");
        int numEnd = sc.nextInt();
        //if user entered incorrect numbers then prints a message about incorrect input
        if (numBegin > numEnd) {
            System.out.println("You entered incorrect range: begin number is bigger than last number");
        } else {
            //save range
            rangeBegin = numBegin;
            rangeEnd = numEnd;
            //thinking a number
            thinkNumber();
            //guessing a number
            guessNumber();
        }
    }

    /**
     * Computer thinks a number in certain range
     */
    private void thinkNumber() {
        number = rangeBegin + (int) (Math.random() * rangeEnd);
    }

    private void guessNumber() {
        //offer for user to guess a number from console
        System.out.println("Guess number: ");
        Scanner sc = new Scanner(System.in);
        int guessNumber = 0;
        int guessCount = 0;
        //checks if the number is guessed
        do {
            guessNumber = sc.nextInt();
            //calculates number of percent as far as the user is close to thought number
            int guessPercent = countGuessPercent(guessNumber);
            //remembers count of attempts
            guessCount++;
            //prints a message in the console depending on the guessing result
            if (guessPercent == 100) {
                System.out.println("You guessed in " + guessCount + " attemps");
            } else if (guessPercent < 100 && guessPercent >= 75) {
                System.out.println("Hotter");
            } else if (guessPercent < 75 && guessPercent >= 50) {
                System.out.println("Warm");
            } else if (guessPercent < 50 && guessPercent >= 25) {
                System.out.println("Colder");
            } else if (guessPercent < 25 && guessPercent >= 0) {
                System.out.println("Cold");
            } else {
                System.out.println("Very cold");
            }
        }
        while (guessNumber != number);
    }

    //calculates how much user's number is closed to thought number(in percent)
    private int countGuessPercent(int guessNumber) {
        int diff = Math.abs(number - guessNumber);
        int range = rangeEnd - rangeBegin;
        double ref = (double) diff / range;
        int percent = (int) (100 - ref * 100);
        return percent;
    }
}


