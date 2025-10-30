public class TitleCase {
    public static void main(String[] args) {
        String s = "java is awesome";
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : arr) sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        System.out.println(sb.toString().trim());
    }
}