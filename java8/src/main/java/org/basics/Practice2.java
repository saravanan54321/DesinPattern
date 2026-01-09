package org.basics;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice2 {


    public static void main(String[] args) {

//        List<Integer> list = List.of(10, 20, 30);
//
//      OptionalInt f=   list.stream().mapToInt(i->i).min();
//
//      list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        int input = 12345;
//         int j =String.valueOf(input).chars().map(i-> i-'0').sum();
//         System.out.println(j);

        String s = "Hello World";

       Map<Character,Long> b = s.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(b);









    }
}
