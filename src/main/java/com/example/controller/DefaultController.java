package com.example.controller;

import com.example.trialanderror.Bean1RequestProcessor;
import com.example.trialanderror.SampleData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {


    @Autowired
    Bean1RequestProcessor bean1RequestProcessor;

   @GetMapping("/")
   private String printDefault()
    {

        return "Default Message.....";
    }


    @PostMapping("/sample")
    private ResponseEntity<SampleData> checkSamplePostMessage(@RequestBody SampleData sampleData)
    {
        return ResponseEntity.status(200).body(sampleData);
    }
}
