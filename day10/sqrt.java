//square root of a number using recursion
package day10;

public class sqrt {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        return sqrtHelper(x, 1, x / 2);
    }

    private int sqrtHelper(int x, int left, int right) {
        if (left > right) {
            return right; 
        }
        int mid = left + (right - left) / 2;
        if (mid <= x / mid) {
            return sqrtHelper(x, mid + 1, right); 
        } else {
            return sqrtHelper(x, left, mid - 1); 
        }
    }

    public static void main(String[] args) {
        sqrt obj = new sqrt();
        System.out.println(obj.mySqrt(0)); 
        System.out.println(obj.mySqrt(1)); 
        System.out.println(obj.mySqrt(4));   
        System.out.println(obj.mySqrt(8));   
        System.out.println(obj.mySqrt(2147395599)); 
    }

}
