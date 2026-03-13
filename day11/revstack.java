// reversing the stack using string
package day11;
import java.util.Stack; 
public class revstack {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "DARSHAN";
                for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        
        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }
        
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr.toString());
    }
}
