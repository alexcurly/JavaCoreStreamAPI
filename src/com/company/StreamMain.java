package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {
    public static void streamAPI(){
        int [] input = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};

        List<Integer> result =
                Arrays.stream(input)
                        .filter(x -> x > 0)
                        .filter(x -> x % 2 == 0)
                        .sorted(/*Comparator.naturalOrder()*/)
                        .boxed()
                        .collect(Collectors.toList());
        System.out.println(result);
    }
}
