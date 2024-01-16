package com.keelient.functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        //Normal Java function
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("06000000000"));

        //Predicate functional interface
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000000000"));
        System.out.println(containsNumberThree.test("0300000000"));
        //and
        System.out.println(isPhoneNumberValidPredicate.and(containsNumberThree).test("07000000030"));
        //or
        System.out.println(isPhoneNumberValidPredicate.or(containsNumberThree).test("07000000040"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
                                                phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumberThree = phoneNumber -> phoneNumber.contains("3");
}
