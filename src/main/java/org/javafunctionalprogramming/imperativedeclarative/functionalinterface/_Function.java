package org.javafunctionalprogramming.imperativedeclarative.functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
       int i = incremenet(0);
        System.out.println(i);
        int i2 = incrementByOneFunction.apply(i);
        System.out.println(i2);

    }

    static Function<Integer,Integer> incrementByOneFunction = number -> number + 1;

    static int incremenet(int number){
        return number+1;
    }
}
