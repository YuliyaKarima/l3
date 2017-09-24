import java.util.*;

/**
 * Class for calculating factorial of a number
 */
public class Factorial {
    public static void main(String[] args) {
        testFactorial();
        testFactorial();
    }

    /**
     * Calculates a number's factorial
     *
     * @param num a number entered by user from console
     * @return number'a factorial
     */
    public static int factorial(int num) {
        if (num == 1 || num == 0) {
            return 1;
        } else {
            return num * factorial((num - 1));
        }
    }

    /**
     * offeres user to input a number and calculates its factorial
     */
    public static void testFactorial() {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Факториал числа " + num + " = " + factorial(num));
    }
}
