package day2;

public class poweroftwo {
    // Uses n & (n - 1) to clear the lowest set bit; power of two has only one set bit.
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        poweroftwo obj = new poweroftwo();
        System.out.println(obj.isPowerOfTwo(1));   // true
        System.out.println(obj.isPowerOfTwo(16));  // true
        System.out.println(obj.isPowerOfTwo(18));  // false
    }
}
