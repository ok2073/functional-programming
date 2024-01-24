package com.keelient.callbacks;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        //Function<String, String> upperCaseName = name -> name.toUpperCase();
        Function<String, String> upperCaseName = String::toUpperCase;
        System.out.println(upperCaseName.apply("Oliver Queen"));

        Function<String, String> upperCaseName2 = name -> {
            if(name.isBlank()){
                throw new IllegalStateException(" ");
            }
            return name.toUpperCase();
        };
        System.out.println(upperCaseName.apply(""));

        BiFunction<String, Integer, String> upperCaseNameBifunction = (name, age) -> {
            if(name.isBlank()){
                throw new IllegalStateException("");
            }
            System.out.println(age);
            return name.toUpperCase();
        };
        System.out.println(upperCaseNameBifunction.apply("Roy Harper", 28));
    }
}
