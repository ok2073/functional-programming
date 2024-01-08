package com.keelient.functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println("\nincrement I: " + increment);

        int incrementII = incrementByOneFunction.apply(10);
        System.out.println("\nincrement II: " + incrementII);

        int multiply = multiplyByTenFunction.apply(increment);
        System.out.println("\nmultiply: " + multiply);

        Function<Integer, Integer> addByOneAndThenMultiplyByTen = incrementByOneFunction.andThen(multiplyByTenFunction);
        int addByOneAndThenMultiplyByTenVar = addByOneAndThenMultiplyByTen.apply(1);
        System.out.println("\naddByOneAndThenMultiplyByTenVar: " + addByOneAndThenMultiplyByTenVar);
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;


    static int incrementByOne(int number) {
        return number + 1;
    }
}
