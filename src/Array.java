import java.util.*;

/**
 * Class for creating an array with user-defined parameters of dimension
 */

public class Array {
   static Random random = new Random();

    public static void main(String[] args) {
        //offer for user to enter two numbers
        System.out.println("Enter two numbers: ");
        //user enters two number from console
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //invoking method createArray() for creating an array
        int array[][] = createArray(num1, num2);
        //offer for user to enter a number from console
        System.out.println("Enter a number from 0 to 100: ");
        int num = sc.nextInt();
        //calculating amount of this number in the array
        int countNum = checkValue(num, array);
        System.out.println("Count of number " + num + " in this array = " + countNum);

    }

    /**Method for creating and initializing two-dimension array with random numbers from 0 to 100
     *
     * @param m arrays' raw
     * @param n arrays' column
     * @return two-dimension array
     */
    public static int[][] createArray(int m, int n) {
        int[][] array = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int y = 0; y < n; y++) {
                array[i][y] = random.nextInt(101);
            }
        }
        return array;
    }

    /**Method for calculationg amount of certain number in two-dimension array
     *
     * @param num a number which amount in an array will be calculated
     * @param array an array for searching certain number
     * @return amount of such numbers int the array
     */
    public static int checkValue(int num, int array[][]) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                System.out.print("|" + array[i][y] + "|");
                if (array[i][y] == num) {
                    count++;
                }
            }
            System.out.println();
        }
        return count;
    }
}
