/*Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without 
disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).*/

package day5;

public class subsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // Pointer for s
        for (int j = 0; j < t.length() && i < s.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; 
            }
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        subsequence obj = new subsequence();
        System.out.println(obj.isSubsequence("abc", "ahbgdc")); 
        System.out.println(obj.isSubsequence("axc", "ahbgdc")); 
    }

}
