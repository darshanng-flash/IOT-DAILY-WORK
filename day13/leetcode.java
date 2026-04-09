//132 pattren
package day13;

public class leetcode {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return false;
        }
        int[] minArray = new int[n];
        minArray[0] = nums[0];
        for (int i = 1; i < n; i++) {
            minArray[i] = Math.min(minArray[i - 1], nums[i]);
        }
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (int j = n - 1; j >= 0; j--) {
            while (!stack.isEmpty() && stack.peek() <= minArray[j]) {
                stack.pop();
            }
            if (!stack.isEmpty() && stack.peek() < nums[j]) {
                return true; 
            }
            stack.push(nums[j]);
        }
        return false;
    }

    public static void main(String[] args) {
        leetcode obj = new leetcode();
        System.out.println(obj.find132pattern(new int[]{1, 2, 3, 4})); 
        System.out.println(obj.find132pattern(new int[]{3, 1, 4, 2}));
        System.out.println(obj.find132pattern(new int[]{-1, 3, 2, 0}));
    }
}
