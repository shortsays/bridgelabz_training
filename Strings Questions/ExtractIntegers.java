import java.util.*;
import java.util.regex.*;
public class ExtractIntegers {
    public static void main(String[] args) {
        String s = "abc123def45";
        Matcher m = Pattern.compile("\\d+").matcher(s);
        List<Integer> list = new ArrayList<>();
        while (m.find()) list.add(Integer.parseInt(m.group()));
        System.out.println(list);
    }
}