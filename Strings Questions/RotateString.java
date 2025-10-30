public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        int k = 1;
        k = k % s.length();
        String res = s.substring(s.length() - k) + s.substring(0, s.length() - k);
        System.out.println(res);
    }
}