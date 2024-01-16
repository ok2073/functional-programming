package com.keelient.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        //Normal Java function
        greetCustomer(new Customer("Mark", "999999"));

        //Consumer functional interface
        greetConsumerCustomer.accept(new Customer("Oliver", "123456"));

        //BiConsumer functional interface
        greetConsumerBiCustomer.accept(new Customer("Thea", "123456"), false);
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                            ", thanks for registering phone number " +
                            customer.customerPhoneNumber);
    }

    static Consumer<Customer> greetConsumerCustomer = customer -> System.out.println("Hello " + customer.customerName +
            ", thanks for registering phone number " +
            customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetConsumerBiCustomer = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName +
            ", thanks for registering phone number " +
                    (showPhoneNumber ?  customer.customerPhoneNumber : "*********"));

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
