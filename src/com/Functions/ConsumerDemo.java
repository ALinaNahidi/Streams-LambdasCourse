package com.Functions;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Movie movie = new Movie("xyz",10);

        new ConsumerDemo().testConsumer(movie);

    }

    private void testConsumer(Movie movie){
        Consumer<Movie> printInfo = m-> System.out.println("Info: "+ m);
        Consumer<Movie> printAsk = m-> System.out.println("Next movie?");

        printInfo.andThen(printAsk).accept(movie);
    }

}
