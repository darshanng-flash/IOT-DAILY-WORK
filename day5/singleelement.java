/*You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.*/
package day5;

public class singleelement {

    public int singleNonDuplicate(int[] nums) {
        
    }

    public static void main(String[] args) {
        singleelement obj = new singleelement();
        System.out.println(obj.singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8})); // Output: 2
        System.out.println(obj.singleNonDuplicate(new int[]{3,3,7,7,10,11,11})); // Output: 10
    }
}
