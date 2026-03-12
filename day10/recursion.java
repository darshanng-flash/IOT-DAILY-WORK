//reversing the numbers from 5 to 1 using recursion:
package day10;

public class recursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Reversed numbers from " + n + " to 1:");
        reverse(n);
    }

    public static void reverse(int n) {
        if (n == 0) {
            return; // Base case: stop when n reaches 0
        }
        System.out.print(n + " "); // Print the current number
        reverse(n - 1); // Recursive call with n decremented by 1
    }

}
