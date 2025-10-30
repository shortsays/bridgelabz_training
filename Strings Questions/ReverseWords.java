public class ReverseWords {
    public static void main(String[] args) {
        String s = "Java is fun";
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) sb.append(arr[i]).append(" ");
        System.out.println(sb.toString().trim());
    }
}