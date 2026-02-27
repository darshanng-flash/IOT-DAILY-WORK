//Separete letters and numbers from a string
package day5;

public class separateLN {
    public static void main(String[] args) {
        String input = "papa69ki69pari69696969";
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else if (Character.isDigit(ch)) {
                numbers.append(ch);
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Numbers: " + numbers);
    }

}
