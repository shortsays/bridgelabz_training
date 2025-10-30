public class CountVowelsConsonants {
    public static void main(String[] args) {
        String s = "Hello World".toLowerCase();
        int v = 0, c = 0;
        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) v++;
            else if (Character.isLetter(ch)) c++;
        }
        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }
}