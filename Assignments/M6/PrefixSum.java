public class PrefixSum {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        int n = arr.length;

        int prefix[] = new int[n];

        prefix[0] = arr[0];

        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        int l = 1, r = 3;

        int sum = prefix[r] - prefix[l-1];

        System.out.println("Range Sum = " + sum);
    }
}