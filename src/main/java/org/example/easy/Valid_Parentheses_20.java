package org.example.easy;

public class Valid_Parentheses_20 {
    public boolean isValid(String s) {

        // square brackets = [] - sb
        // curly brackets = {} - cb
        // parentheses = () - pb
        // angled brackets = <> - ab

        if (s.length() % 2 != 0) return false;

        int top = -1;
        char[] chars = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') chars[++top] = ch;

            else if (ch == ')' && (top == -1 || chars[top--] != '(')) return false;

            else if (ch == '}' && (top == -1 || chars[top--] != '{')) return false;

            else if (ch == ']' && (top == -1 || chars[top--] != '[')) return false;

        }

        return top == -1;
    }
}
