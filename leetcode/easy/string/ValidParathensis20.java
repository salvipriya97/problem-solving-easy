package leetcode.easy.string;

import java.util.ArrayDeque;
import java.util.Deque;

/*
* https://leetcode.com/problems/valid-parentheses/description/
* */
public class ValidParathensis20 {
    public static boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) return false;

        Deque<Character> stck = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {


            switch(ch) {
                case '(':
                    stck.push(')');
                    break;
                case '[':
                    stck.push(']');
                    break;
                case '{':
                    stck.push('}');
                    break;
                default:
                    if (stck.isEmpty() ||
                            ch != stck.pop()
                    )
                        return false;
            }
        }
        return stck.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}
