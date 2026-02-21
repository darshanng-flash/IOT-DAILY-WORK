package day2;

public class intsqrt {
    // Integer square root via binary search; avoids overflow by dividing mid.
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 1;
        int right = x / 2;
        int ans = 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                ans = mid;      // mid^2 <= x; move right
                left = mid + 1;
            } else {
                right = mid - 1; // mid^2 > x; move left
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        intsqrt obj = new intsqrt();
        System.out.println(obj.mySqrt(0));   // 0
        System.out.println(obj.mySqrt(1));   // 1
        System.out.println(obj.mySqrt(4));   // 2
        System.out.println(obj.mySqrt(8));   // 2
        System.out.println(obj.mySqrt(2147395599)); // 46339
    }
}
