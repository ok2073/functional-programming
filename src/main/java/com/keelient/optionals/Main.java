package com.keelient.optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default value");
        System.out.println(value);

        value = Optional.ofNullable("Bob")
                .orElseThrow(() -> new IllegalStateException("exception"));
        System.out.println(value);

        Optional.ofNullable("oliver@starcity.com")
                .ifPresent(email -> System.out.println("sending email to: " + email));

        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("sending email to: " + email),
                                () -> System.out.println("Cannot send email"));

    }
}
