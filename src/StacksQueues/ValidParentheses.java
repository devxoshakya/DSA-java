package StacksQueues;
import java.util.*;

/**
 * ValidParentheses
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            if(c == ')' || c == '}' || c == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                char popped = stack.pop();
                if(c == ')' && popped != '('){
                    return false;
                }
                if(c == '}' && popped != '{'){
                    return false;
                }
                if(c == ']' && popped != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}