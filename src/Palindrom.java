import java.util.Scanner;

/**
 * Class for searching words that are palindrome in user-defined phrase
 */
public class Palindrom {
    public static void main(String[] args) {
        //offer for user to enter phrase from console
        System.out.println("Введите фразу:  (stop для остановки ввода) ");
        Scanner sc = new Scanner(System.in);
        String line = null;
        do {
            line = sc.next();
            //if a word's length more than 2 symbols
            //then analyse if this word is palindrome
            if (line.length() > 2) {
                if (isPalindrome(line)) {
                    System.out.println("Слово '" + line + "' - палиндром");
                }
            }
        } while (!line.equals("stop"));
    }

    /**
     * Check if a word is palindrome
     *
     * @param line uыer-defined line from console
     * @return true, if this word is palindrome
     * and false, if not
     */
    public static boolean isPalindrome(String line) {
        boolean isPalindrom = false;
        char[] lineReversal = new char[line.length()];
        for (int i = 0; i < lineReversal.length; i++) {
            lineReversal[lineReversal.length - 1 - i] = line.charAt(i);
        }
        String lineCopy = new String(lineReversal);

        if (line.equals(lineCopy)) {
            isPalindrom = true;
        }
        return isPalindrom;
    }
}
