package com.Streams;

import com.Functions.Movie;

import java.util.stream.Stream;

public class CreatingStreams {
    private void testEmptyStream(){
        Stream<Movie> movieEmptyStream = Stream.empty();
        System.out.println("Empty Stream: "+movieEmptyStream.count());
    }

    public void generateIterateStreams() {
        Stream<Double> randomDouble = Stream.generate(Math::random).limit(10);
        randomDouble.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new CreatingStreams().generateIterateStreams();
    }

}
