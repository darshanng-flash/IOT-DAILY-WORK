/*write a function that returns the index of an equilibrium point in an array return the index if conditoin os satisfied.if no such index exists return -1.
iput: arr=[3,4,3,1,6]*/
package day7;

public class equlibrium {
    public int equilibriumPoint(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= arr[i]; // now totalSum is right sum
            if (leftSum == totalSum) {
                return i; // equilibrium point found
            }
            leftSum += arr[i]; // update left sum for next iteration
        }
        return -1; // no equilibrium point found
    }

    public static void main(String[] args) {
        equlibrium obj = new equlibrium();
        int[] arr = {3,4,3,1,6};
        System.out.println(obj.equilibriumPoint(arr)); // Output: 2
    }

}
