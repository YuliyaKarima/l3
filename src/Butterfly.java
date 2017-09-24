import java.util.*;

/**Class for drawing a butterfly on the console by user-defined parameter of length
 *
 */
public class Butterfly {

    public static void main(String[] args) {
        //offer for user to enter a number
        System.out.println("Enter a number - butterfly's length: ");
        //using Scanner to read a number from the console
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //passing this number to the method drawButterfly for drawing a butterfly
        drawButterfly(num);
    }

    /**
     * Print butterfly on the console
     *
     * @param base butterfly's length
     */
    public static void drawButterfly(int base) {
        //creating new char array
        char[][] butterfly = new char[base][base];
        //filling the array
        for (int i = 0; i < base; i++) {
            for (int y = i; y < base - i; y++) {
                butterfly[i][y] = 'x';
                butterfly[base - 1 - i][base - 1 - y] = 'x';
            }
        }
        //printing the array on the console
        for (int i = 0; i < base; i++) {
            for (int y = 0; y < base; y++) {
                System.out.print(butterfly[i][y]);
            }
            System.out.println();
        }
    }
}
