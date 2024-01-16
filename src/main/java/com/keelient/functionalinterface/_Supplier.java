package com.keelient.functionalinterface;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDbConnectionString());
        System.out.println(getDbConnectionStringSupplier.get());
        System.out.println(getDbConnectionStringSupplierList.get());
    }

    static String getDbConnectionString() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDbConnectionStringSupplier = () -> "jdbc://localhost:5432/users";
    static Supplier<List<String>> getDbConnectionStringSupplierList = () -> List.of(
            "jdbc://localhost:5432/users",
            "jdbc://localhost:5432/customer");
}
