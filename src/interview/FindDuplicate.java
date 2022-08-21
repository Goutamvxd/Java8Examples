package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> listref= Arrays.asList(10,20,10,23,1,23,10,3,23);
        Set<Integer> setref=new HashSet<>();
        listref.stream().filter(x ->!setref.add(x)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));

    }

}
