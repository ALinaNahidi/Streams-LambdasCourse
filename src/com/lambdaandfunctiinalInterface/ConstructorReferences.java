package com.lambdaandfunctiinalInterface;

public class ConstructorReferences {
    interface StringArray{
        String[] create(int size);
    }

    private void testArrayConstructorRef(){
        StringArray array=String[]::new;
    }

    public static void main(String[] args) {

    }
}
