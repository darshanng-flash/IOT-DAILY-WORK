//find the missing number input: an array (1,2,4,5,5),expected num(1,2,3,4,5,6)
package day7;

public class missingnum {  
    public int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // since one number is missing
        int totalSum = n * (n + 1) / 2; // sum of first n natural numbers
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num; // sum of given array
        }
        return totalSum - arrSum; // missing number is the difference
    }

    public static void main(String[] args) {
        missingnum obj = new missingnum();
        int[] arr = {1, 2, 4, 5, 6}; // Missing number is 3
        System.out.println(obj.findMissingNumber(arr)); // Output: 3
    }

}
