//subset of array using recursion
package day10;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current)); 
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]); 
            generateSubsets(nums, i + 1, current, result); 
            current.remove(current.size() - 1); 
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public static void main(String[] args) {
        subset obj = new subset();
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = obj.subsets(nums);
        System.out.println(subsets);
    }

}
