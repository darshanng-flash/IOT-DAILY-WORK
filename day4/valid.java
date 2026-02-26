package day4;

public class valid {
      String s;

    public boolean isPalindrome1(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        valid ob = new valid();
        if (ob.isPalindrome1("JavaJ")) {
            System.out.println("palindrome");

        } else {
            System.out.println("Not palindrome");
        }
    }

}
