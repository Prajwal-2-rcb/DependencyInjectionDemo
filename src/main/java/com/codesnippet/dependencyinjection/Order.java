package com.codesnippet.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Order {


    public void process() {
        System.out.println("Order process");
    }
}
