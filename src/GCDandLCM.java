import java.util.*;

/**
 * This class provides methods to calculate LCM (Least common multiple)
 * and GCD(Greatest common divisor)
 * of two numbers entered by user from console
 */
public class GCDandLCM {
    public static void main(String[] args) {
        //offer for user to enter two numbers
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //prints lcm of this numbers using method leastCommonMultiple()
        System.out.println("Least common multiple of numbers " +
                +num1 + " and " + num2 + " is " + leastCommonMultiple(num1, num2));
        //prints lcm of this numbers using method greatestCommonDdivisor()
        System.out.println("Greatest common divisor of numbers " +
                +num1 + " and " + num2 + " is " + greatestCommonDdivisor(num1, num2));
    }

    /**Calculates greatest common divisor of two numbers
     *
     * @param first first number
     * @param second second number
     * @return greatest common divisor of two numbers
     */
    public static int greatestCommonDdivisor(int first, int second) {
        List<Integer> gcd = new ArrayList<Integer>();
        for (int i = 1; i <= first * second; i++) {
            if (((first % i) == 0) && ((second % i) == 0)) {
                //add all such numbers into array list
                gcd.add(i);
            }
        }
        //return last number in the array list
        return gcd.get(gcd.size() - 1);
    }

    /**Calculates least common multiple of two numbers
     *
     * @param first first number
     * @param second second number
     * @return least common multiple of two numbers
     */
    public static int leastCommonMultiple(int first, int second) {
        int lcm = 0;
        for (int i = 1; ; i++) {
            if (((i % first) == 0) && ((i % second) == 0)) {
                lcm = i;
                //if such a number is found yet then stop cycle execution
                break;
            }
        }
        return lcm;
    }
}

