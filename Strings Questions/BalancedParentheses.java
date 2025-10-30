import java.util.*;
public class BalancedParentheses {
    public static void main(String[] args) {
        String s = "(){}[]";
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if ("({[".indexOf(c) != -1) st.push(c);
            else {
                if (st.isEmpty()) { System.out.println(false); return; }
                char top = st.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) { System.out.println(false); return; }
            }
        }
        System.out.println(st.isEmpty());
    }
}