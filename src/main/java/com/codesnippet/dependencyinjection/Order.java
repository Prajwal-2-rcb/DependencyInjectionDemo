package com.codesnippet.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Order {

    @Autowired
    @Lazy
    User user;

}
