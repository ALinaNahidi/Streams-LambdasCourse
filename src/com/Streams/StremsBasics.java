package com.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class StremsBasics {
    public static void main(String[] args) {
        List<String> list = List.of("a","b","c","an");

        var res = list.stream()
                .filter(item->item.startsWith("a"))
                .collect(Collectors.joining(", "));
        System.out.println(res);
    }
}
