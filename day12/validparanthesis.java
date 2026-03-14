//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
/*An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type. */
package day12;
import java.util.Stack;

public class validparanthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||(ch == '}' && top != '{') ||(ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        validparanthesis obj = new validparanthesis();
        System.out.println(obj.isValid("()"));   
        System.out.println(obj.isValid("()[]{}"));   
        System.out.println(obj.isValid("(]"));       
        System.out.println(obj.isValid("([)]"));    
        System.out.println(obj.isValid("{[]}"));    
    }

}
