//rotation of arry by 1 position in anti-clockwise direction
package day6;

public class rotateanti {
    public void rotate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return; 
        }
        int first = nums[0]; 
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1]; 
        }
        nums[nums.length - 1] = first; 
    }

    public static void main(String[] args) {
        rotateanti obj = new rotateanti();
        int[] arr1 = {1, 2, 3, 4, 5};
        obj.rotate(arr1);
        System.out.print("Rotated array: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }

}

