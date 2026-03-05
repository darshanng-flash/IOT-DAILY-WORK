/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.*/
package day7;

public class app {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // Calculate left products
        answer[0] = 1; // No elements to the left of the first element
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        
        // Calculate right products and final answer
        int rightProduct = 1; // No elements to the right of the last element
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct; // Multiply with the right product
            rightProduct *= nums[i]; // Update right product for the next iteration
        }
        
        return answer;
    }

    public static void main(String[] args) {
        app obj = new app();
        int[] nums = {1, 2, 3, 4};
        int[] result = obj.productExceptSelf(nums);
        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
