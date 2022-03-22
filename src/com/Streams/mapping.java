package com.Streams;

import com.Functions.Movie;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class mapping {
    public static void main(String[] args) {
        ArrayList<Movie> arrayList = new ArrayList<>();

        arrayList.add(new Movie("a",10));
        arrayList.add(new Movie("b",20));
        arrayList.add(new Movie("c",10));
        arrayList.add(new Movie("d",30));
        arrayList.add(new Movie("e",40));
        arrayList.add(new Movie("f",10));


        arrayList.stream()
                .map(Movie::getTitle)
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }


}
