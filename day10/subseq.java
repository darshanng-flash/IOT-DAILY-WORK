//subsequence of a string using recursion
package day10;

import java.util.List;
import java.util.ArrayList;

public class subseq {
    public void generateSubsequences(String s, int index, String current, List<String> result) {
        result.add(current); 
        for (int i = index; i < s.length(); i++) {
            generateSubsequences(s, i + 1, current + s.charAt(i), result); 
        }
    }

    public List<String> subsequences(String s) {
        List<String> result = new ArrayList<>();
        generateSubsequences(s, 0, "", result);
        return result;
    }

    public static void main(String[] args) {
        subseq obj = new subseq();
        String s = "abc";
        List<String> subsequences = obj.subsequences(s);
        System.out.println(subsequences);
    }   
}
