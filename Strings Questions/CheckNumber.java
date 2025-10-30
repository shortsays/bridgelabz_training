public class CheckNumber {
    public static void main(String[] args) {
        String[] arr = {"123","12.34","abc"};
        for (String s : arr) System.out.println(s.matches("-?\\d+(\\.\\d+)?"));
    }
}