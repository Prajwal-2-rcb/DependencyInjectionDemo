package com.codesnippet.dependencyinjection;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Order {

    @Autowired
    @Lazy
    User user;

    public void process() {
        System.out.println("Order process");
    }

    public static void main(String[] args) {
        User user = new User();
        Order order = new Order();
        OnlineOrder onlineOrder = new OnlineOrder();
        user.setOrder(onlineOrder);
    }
}
