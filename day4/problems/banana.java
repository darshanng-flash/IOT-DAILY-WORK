//count of occurrence
package day4.problems;

public class banana {
    public static void main(String[] args) {
        String str = "banana";
        char target = 'a';
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == target) {
                count++;
            }
        }

        System.out.println("Number of occurrences of '" + target + "': " + count);
    }

}
