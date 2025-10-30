import java.util.*;
public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int start = 0, maxLen = 0; String res = "";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= start) start = map.get(s.charAt(i)) + 1;
            map.put(s.charAt(i), i);
            if (i - start + 1 > maxLen) {
                maxLen = i - start + 1;
                res = s.substring(start, i + 1);
            }
        }
        System.out.println(res + " (Length: " + maxLen + ")");
    }
}