import java.util.*;
public class MinimumWindow {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) need.put(c, need.getOrDefault(c, 0) + 1);
        int required = need.size(), l = 0, formed = 0, minLen = Integer.MAX_VALUE, start = 0;
        Map<Character, Integer> window = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (need.containsKey(c) && window.get(c).intValue() == need.get(c).intValue()) formed++;
            while (l <= r && formed == required) {
                if (r - l + 1 < minLen) { minLen = r - l + 1; start = l; }
                char cl = s.charAt(l);
                window.put(cl, window.get(cl) - 1);
                if (need.containsKey(cl) && window.get(cl) < need.get(cl)) formed--;
                l++;
            }
        }
        System.out.println(minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen));
    }
}