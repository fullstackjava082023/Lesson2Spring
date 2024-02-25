package org.example;


import org.springframework.stereotype.Component;

@Component()
public class GasEngine extends Engine {

    @Override
    public void go() {
        System.out.println("I am going with GAS");
    }
}

