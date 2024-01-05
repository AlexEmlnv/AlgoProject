package org.example.leetcode_task.l04_stack.l041_valid_parentheses;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        // Time complexity BigO(N), where N=s.length()
        // Space complexity BigO(N)
        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray()) {
            if (ch == '(')
                stack.push(')');
            else if (ch == '{')
                stack.push('}');
            else if (ch == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != ch)
                return false;
        }
        return stack.isEmpty();
    }
}
