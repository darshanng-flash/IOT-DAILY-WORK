// max length of sub array either even and odd or odd and even
package day6;
public class maxlenarr {
    public int maxLength(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        return Math.max(maxLength, currentLength);
    }

    public static void main(String[] args) {
        maxlenarr obj = new maxlenarr();
        System.out.println(obj.maxLength(new int[]{1, 2, 3, 4, 5})); // Output: 5
        System.out.println(obj.maxLength(new int[]{1, 3, 5, 7})); // Output: 1
        System.out.println(obj.maxLength(new int[]{2, 4, 6, 8})); // Output: 1
        System.out.println(obj.maxLength(new int[]{1, 2, 4, 7, 10})); // Output: 4
    }

}
