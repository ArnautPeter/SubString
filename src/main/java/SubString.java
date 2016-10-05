import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SubString {
    public static void main(String[] args) {
        System.out.println("Input string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String subString = findSubString(str);
        System.out.println("Unique substring");
        System.out.println(subString);
    }

    static String findSubString(String str) {
        Set<Character> set = new LinkedHashSet<Character>();
        char[] tempArray = str.toCharArray();
        int index = 0;
        String result = "";
        while (result.length() <= str.length() - index || index < str.length()) {
            for (int i = index; i < str.length(); ) {
                if (!set.contains(tempArray[i]) && (set.size() <= str.length() - index)) {
                    set.add(tempArray[i]);
                    i++;
                } else {
                    if (set.size() > result.length()) {
                        result = "";
                        for (char ch : set) {
                            result = result + ch;
                        }
                    }
                    set.clear();
                    i = ++index;
                }
            }
        }
        return result;
    }
}
