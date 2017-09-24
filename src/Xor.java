/**
 * In this class two number change values by using bitwise XOR operation
 */
public class Xor {
    private int a;
    private int b;

    public static void main(String[] args) {
        Xor xor = new Xor(9, 12);
        System.out.println(xor);
        xor.changeValues();
        System.out.println(xor);
    }

    /**
     * Changes values of class fields by using bitwise XOR operation
     */
    private void changeValues() {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }

    public Xor(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String toString() {
        return "a: " + a + ", b: " + b;
    }
}
