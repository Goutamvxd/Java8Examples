package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String s="hi how are you goutam how are you";
        List<String > wordcount= Arrays.asList(s.split(" "));
        Map<String,Long> refobj=wordcount.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(refobj);
    }
}
