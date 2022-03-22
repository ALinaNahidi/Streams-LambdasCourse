package com.lambdaandfunctiinalInterface;

public class functionalInterfaceAnnotation {

    @FunctionalInterface
    interface Cruncher{
        int crunch(int a, int b);
    }

    public int cruncherService(int i , int j, Cruncher cruncher){
        return cruncher.crunch(i,j);
    }

    public static void main(String[] args) {
        functionalInterfaceAnnotation fia = new functionalInterfaceAnnotation();

        int ans = fia.cruncherService(3,4,(i,j) -> i*j);
        System.out.println(ans);

        ans = fia.cruncherService(3,4,(i,j) -> i/j);
        System.out.println(ans);

        ans = fia.cruncherService(3,4,(i,j) -> i+j);
        System.out.println(ans);

        ans = fia.cruncherService(3,4,(i,j) -> i%j);
        System.out.println(ans);

    }
}
