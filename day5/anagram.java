//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
package day5;

public class anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        anagram obj = new anagram();
        System.out.println(obj.isAnagram("listen", "silent")); // true
        System.out.println(obj.isAnagram("hello", "world"));   // false
    }

}
