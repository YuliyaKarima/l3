import java.util.Scanner;

/**
 * This class provides methos to change a String line entered by user from console
 */
public class StringChange {

    public static void main(String[] args) {
        //offer for user to enter two numbers
        System.out.println("Enter a line: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        //prints menu
        System.out.println("Choose an option: ");
        System.out.println("1. Delete numbers from the line");
        System.out.println("2. Change all latin symbols by '?'");
        System.out.println("3. Leave cyrillic symbols and numbers in the line");
        //check an option number that user input from console
        int option = sc.nextInt();
        switch (option) {
            case (1):
                firstOption(line);
                break;
            case (2):
                secondOption(line);
                break;
            case (3):
                thirdOption(line);
                break;
            default:
                System.out.println("You entered incorrect number");
        }
    }

    /**
     * In this method digits are being deleted from the line entered by user
     *
     * @param line String line input by user from console
     */
    public static void firstOption(String line) {
        StringBuilder lineChange = new StringBuilder();
        String newLine = null;
        //analysing each char symbol in the line
        for (int i = 0; i < line.length(); i++) {
            if (!(line.charAt(i) >= 48 && line.charAt(i) <= 57)) {
                lineChange.append(line.charAt(i));
            }
        }
        newLine = new String(lineChange);
        //prints new line in the console
        System.out.println("New line is: \n" + newLine);
    }

    /**
     * In this method all latin symbols in the line entered by user are being replaced by '?' symbol
     *
     * @param line String line input by user from console
     */
    public static void secondOption(String line) {
        StringBuilder lineChange = new StringBuilder();
        String newLine = null;
        //analysing each char symbol in the line
        for (int i = 0; i < line.length(); i++) {
            if ((line.charAt(i) >= 65 && line.charAt(i) <= 90) || (line.charAt(i) >= 97 && line.charAt(i) <= 122)) {
                lineChange.append("?");
            } else {
                lineChange.append(line.charAt(i));
            }
        }
        newLine = new String(lineChange);
        //prints new line in the console
        System.out.println("New line is: \n" + newLine);
    }

    /**
     * In this method all latin symbols and digits in the line entered by user are being deleted
     *
     * @param line String line input by user from console
     */

    public static void thirdOption(String line) {
        StringBuilder lineChange = new StringBuilder();
        String newLine = null;
        //analysing each char symbol in the line
        for (int i = 0; i < line.length(); i++) {
            if (!((line.charAt(i) >= 65 && line.charAt(i) <= 90) || (line.charAt(i) >= 97 && line.charAt(i) <= 122))) {
                lineChange.append(line.charAt(i));
            }
        }
        newLine = new String(lineChange);
        //prints new line in the console
        System.out.println("New line is: \n" + newLine);
    }
}
