/**
 * This class demonstrates bitwise shift operations
 */
public class BitShift {

    public static void main(String[] args) {
        int x = -8;
        //prints results
        System.out.println("x >> 2 = " + rightShift(x, 2));
        System.out.println("x << 2 = " + leftShift(x, 2));
        System.out.println("x >>> 2 = " + rightUnsignedShift(x, 2));
    }

    /**
     * Calculates bitwise right shift
     *
     * @param num   a number
     * @param shift count of position for shift
     * @return result of operation
     */
    public static int rightShift(int num, int shift) {
        return num >> shift;
    }

    /**
     * Calculates bitwise left shift
     *
     * @param num   a number
     * @param shift count of position for shift
     * @return result of operation
     */
    public static int leftShift(int num, int shift) {
        return num << shift;
    }

    /**
     * Calculates bitwise right unsigned shift
     *
     * @param num   a number
     * @param shift count of position for shift
     * @return result of operation
     */
    public static int rightUnsignedShift(int num, int shift) {
        return num >>> shift;
    }
}
