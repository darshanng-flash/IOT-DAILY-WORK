//max length of sub array either even and odd or odd and even
package day6;

public class maxlen {
    public static void main(String[] args) {
        int[] arr = {10,12,14,7,8};
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
        maxLength = Math.max(maxLength, currentLength); 

        System.out.println("max len: " + maxLength);
    }


}
