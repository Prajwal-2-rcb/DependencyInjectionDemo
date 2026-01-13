package com.codesnippet.dependencyinjection;

public class User {

    Order order;

    public User(Order order) {
        this.order = order;
        System.out.println("Initializing User");
    }
}
