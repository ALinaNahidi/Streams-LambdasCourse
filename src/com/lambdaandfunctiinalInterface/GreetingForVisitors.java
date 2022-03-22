package com.lambdaandfunctiinalInterface;

public class GreetingForVisitors {
    interface Greet{
        String greeting(String name);
    }

    public static String greetHere(String name,Greet msg){
        String result = msg.greeting(name);
        return result;
    }

    public static void main(String[] args) {

        System.out.println(greetHere("Alina",(msg-> "Hello, "+msg)));
        System.out.println(greetHere("xyz",(msg-> "Hello, "+msg)));
        System.out.println(greetHere("",(msg-> (!msg.isEmpty()) ? ("Hello, " + msg) : "Did you miss something?")));
    }

}

