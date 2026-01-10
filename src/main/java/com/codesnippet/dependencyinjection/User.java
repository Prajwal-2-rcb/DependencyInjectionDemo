package com.codesnippet.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    Order order;
//    @Autowired
//    private OnlineOrder onlineOrder;


    OnlineOrder onlineOrder;

    @Autowired
    public void setOrder(OnlineOrder onlineOrder) {
        this.onlineOrder = onlineOrder;
    }


    //Demonstrating NPE Exception
    public void process() {
        order.process();
    }

    public static void main(String[] args) {
        User user=new User();
        user.process();
    }
}
