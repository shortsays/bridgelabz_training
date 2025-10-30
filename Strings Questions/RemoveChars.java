public class RemoveChars {
    public static void main(String[] args) {
        String s1 = "hello world", s2 = "ole";
        StringBuilder sb = new StringBuilder();
        for (char c : s1.toCharArray()) if (s2.indexOf(c) == -1) sb.append(c);
        System.out.println(sb.toString());
    }
}