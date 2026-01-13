package com.codesnippet.dependencyinjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OnlineOrder implements Order {

    public OnlineOrder() {
        System.out.println("Init  online order");
    }

    public void process() {
        System.out.println("Processing online order");
    }
}
