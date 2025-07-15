package com.abhi.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    private String name = "Abhishek";

    private Payment payment;

    // Constructor based dependency injection using Autowired annotation
    @Autowired
    public Customer(Payment payment){
        this.payment = payment;
    }

    // getters and setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Payment getPayment(){
        return payment;
    }

    public void setPayment(Payment payment){
        this.payment = payment;
    }

}

