/*given an array of length n, your task is to count the number of triplets that we can form 
sample input : arr:{1,5,3,2}*/
package day7;

public class triplet {
    public int countTriplets(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] < arr[j] && arr[j] < arr[k]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        triplet obj = new triplet();
        int[] arr = {1,2,3,4,5,6};
        System.out.println(obj.countTriplets(arr)); // 
    }

}
