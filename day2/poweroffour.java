package day2;

public class poweroffour {
    // Checks power of four: single set bit at even position.
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }

    public static void main(String[] args) {
        poweroffour obj = new poweroffour();
        System.out.println(obj.isPowerOfFour(1));   // true
        System.out.println(obj.isPowerOfFour(4));   // true
        System.out.println(obj.isPowerOfFour(16));  // true
        System.out.println(obj.isPowerOfFour(8));   // false
    }
}
