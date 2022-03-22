package com.lambdaandfunctiinalInterface;

public class LambdaScope extends SuperScope{

    private String member = "DAD";

    interface Family{
        String who(String member);
    }

    public void testMember(String member){
        Family familyLambda = (familyMember)-> {
            System.out.println("local member "+member);
            System.out.println("local member "+familyMember);
            System.out.println("local member (this) "+this.member);
            System.out.println("local member (super)"+super.member);
            return familyMember;
        };

        familyLambda.who(member);
    }

    public static void main(String[] args) {
        new LambdaScope().testMember("me");
    }
}
