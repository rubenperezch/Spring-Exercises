package com.greenfoxacademy.springstart.Model;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

    private String name;
    private long number;
    private AtomicLong counter = new AtomicLong();

    public Greeting(String name, long number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public long getNumber() {
        return number;
    }

    public AtomicLong getCounter() {
        return counter;
    }
}
