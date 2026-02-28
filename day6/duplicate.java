/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.*/
package day6;

public class duplicate {
    public boolean containsDuplicate(int[] nums) {
        java.util.HashSet<Integer> seen = new java.util.HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true; 
            }
            seen.add(num);
        }
        return false; 
    }

    public static void main(String[] args) {
        duplicate obj = new duplicate();
        System.out.println(obj.containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(obj.containsDuplicate(new int[]{1, 2, 3, 4})); 
        System.out.println(obj.containsDuplicate(new int[]{1, 1, 1, 3})); 
    }
}
