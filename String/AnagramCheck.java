package GFG160.String;

import java.util.Arrays;

public class AnagramCheck {
    public static boolean anagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] charS1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Arrays.sort(charS1);
        Arrays.sort(chars2);

        return Arrays.equals(charS1, chars2);
    }

    public static void main(String[] arg) {
        String s1 = "aabcdd";
        String s2 = "ddcbaa";

        if (anagram(s1, s2) == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
