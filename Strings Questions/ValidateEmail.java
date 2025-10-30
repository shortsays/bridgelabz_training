import java.util.regex.*;
public class ValidateEmail {
    public static void main(String[] args) {
        String email = "someone@example.com";
        System.out.println(Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email));
    }
}