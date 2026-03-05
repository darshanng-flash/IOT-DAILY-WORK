/*given an unsorted array A of  size N that contains only positive integers,
find continuous subarray that adds to a given number S and reurn the left and right index(1-based)of the subarray 
incase of multiple solutions return the first one moving from left*/
package day7;

public class continues {
    public int[] findSubarray(int[] arr, int S) {
        int n = arr.length;
        int left = 0, right = 0, currentSum = 0;
        while (right < n) {
            currentSum += arr[right];
            while (currentSum > S && left <= right) {
                currentSum -= arr[left];
                left++;
            }
            if (currentSum == S) {
                return new int[]{left + 1, right + 1}; // Return 1-based indices
            }
            right++;
        }
        return new int[]{-1}; // No subarray found
    }

    public static void main(String[] args) {
        continues obj = new continues();
        int[] arr = {1, 2, 3, 7, 5};
        int S = 12;
        int[] result = obj.findSubarray(arr, S);
        if (result.length == 2) {
            System.out.println("Subarray found from index " + result[0] + " to " + result[1]);
        } else {
            System.out.println("No subarray found");
        }
    }

}
