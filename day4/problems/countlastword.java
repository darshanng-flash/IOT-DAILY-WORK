//Given a string s consisting of words and spaces, return the length of the last word in the string.A word is a maximal substring consisting of non-space characters only.
package day4.problems;

public class countlastword {
    public static void main(String[] args) {
        String s = "Hello World";
        int lastWordLength = lengthOfLastWord(s);
        System.out.println("Length of the last word: " + lastWordLength);
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim(); 
        int lastSpaceIndex = s.lastIndexOf(' '); 
        return s.length() - lastSpaceIndex - 1; 
    }

}
