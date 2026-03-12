//JOSEPHUS PROBLEM  
package day10;

public class JOSEPHUS {
    public static void main(String[] args) {
        int n = 7; // Number of people in the circle
        int k = 3; // Step count for elimination
        int survivor = josephus(n, k);
        System.out.println("The survivor is: " + survivor);
    }

    public static int josephus(int n, int k) {
        if (n == 1) {
            return 1; // Base case: only one person left
        }
        // Recursive case: find the position of the survivor in the reduced circle
        return (josephus(n - 1, k) + k - 1) % n + 1;
    }

}
