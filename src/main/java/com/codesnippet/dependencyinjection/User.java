package com.codesnippet.dependencyinjection;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class User {

    Order order;

    public User(Order order) {
        this.order = order;
        System.out.println("Initializing User");
    }

    @PostConstruct
    public void init()
    {
        order.setorder(this);
    }
}
