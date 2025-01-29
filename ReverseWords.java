package Experiment3;

import java.util.StringTokenizer;

public class ReverseWords {
    public static String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            sb.insert(0, st.nextToken() + " ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "This is decent";
        System.out.println("Reversed: " + reverseWords(s));
    }
}
