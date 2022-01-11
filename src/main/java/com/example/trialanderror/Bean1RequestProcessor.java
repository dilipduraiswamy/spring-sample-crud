package com.example.trialanderror;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bean1RequestProcessor {

    @Autowired
    private Processor processor;


    public void execute(){
        processor.setBean("bean2"); 
    }




}
