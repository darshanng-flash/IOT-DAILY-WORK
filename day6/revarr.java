//revrese an array to find the sum of elements located at even positions in the reversed array
package day6;

public class revarr {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int sumEvenPositions = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if ((arr.length - 1 - i) % 2 == 0) { 
                sumEvenPositions += arr[i];
            }
        }

        System.out.println("Sum of elements at even positions in the reversed array: " + sumEvenPositions);
    }
}
