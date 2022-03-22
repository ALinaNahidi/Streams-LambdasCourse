package com.Functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionFunctionalInterface {
    BiFunction<String,Integer,Movie> createMovieBiFunction = (s,i)-> new Movie(s, i);
    Function<String,Movie> createMovieFunction = (s)-> new Movie(s,10);

    private void testFunction(String movieName,int likes){
        Movie movie = createMovieFunction.apply(movieName);
        Movie movieB =createMovieBiFunction.apply(movieName,likes);
        System.out.println(movie);
        System.out.println(movieB);
    }

    public static void main(String[] args) {
        new FunctionFunctionalInterface().testFunction("abc",20);
    }
}
