/*given an array arr of length n .your task is to print non repeating element from the given arrray
sampple input:{1,2,3,4,2,1}
output{3,4}*/
package day6;

public class twononrep {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1};
        int xor = 0;
        for (int num : arr) {
            xor ^= num; 
        }
        int setBit = xor & -xor;

        int num1 = 0, num2 = 0;
        for (int num : arr) {
            if ((num & setBit) != 0) {
                num1 ^= num; 
            } else {
                num2 ^= num; 
            }
        }

        System.out.println("The two non-repeating numbers are: " + num1 + " and " + num2);
    }
}
