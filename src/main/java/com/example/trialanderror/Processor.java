package com.example.trialanderror;

import org.springframework.stereotype.Component;

@Component
public class Processor {

    private String bean;


    public Processor() {

    }

    public void setBean(String bean) {
        this.bean = bean;
    }
}
