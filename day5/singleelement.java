/*You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.*/
package day5;

public class singleelement {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if mid is even or odd and compare with the next element
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    left = mid + 2; // Move right
                } else {
                    right = mid; // Move left
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    left = mid + 1; // Move right
                } else {
                    right = mid - 1; // Move left
                }
            }
        }

        return nums[left]; // The single element
    }

    public static void main(String[] args) {
        singleelement obj = new singleelement();
        System.out.println(obj.singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8})); // 2
        System.out.println(obj.singleNonDuplicate(new int[]{3,3,7,7,10,11,11})); // 10
    }
}