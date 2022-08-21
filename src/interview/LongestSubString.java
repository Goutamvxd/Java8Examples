package interview;

// find longest substring in given string

import java.util.Arrays;
import java.util.Comparator;

public class LongestSubString {
    public static void main(String[] args) {
        String str="Hi goutam what are you doing";
        String longestWord= Arrays.stream(str.split(" ")).
                max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(longestWord);
    }
}
