//reverse number by using recursion

package day10;

public class reverse {
    public int reverseNumber(int x) {
        long rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0; // Handle overflow
            }
        }
        return (int) rev;
    }

    public static void main(String[] args) {
        reverse obj = new reverse();
        System.out.println(obj.reverseNumber(123));   
        System.out.println(obj.reverseNumber(-123)); 
        System.out.println(obj.reverseNumber(120));
        System.out.println(obj.reverseNumber(0));  
    }
}