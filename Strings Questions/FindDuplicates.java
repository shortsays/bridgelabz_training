import java.util.*;
public class FindDuplicates {
    public static void main(String[] args) {
        String s = "programming";
        Set<Character> seen = new HashSet<>(), dup = new HashSet<>();
        for (char c : s.toCharArray()) if (!seen.add(c)) dup.add(c);
        System.out.println(dup);
    }
}