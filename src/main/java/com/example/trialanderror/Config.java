package com.example.trialanderror;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    //@Qualifier("bean1")
    //@Primary
    String bean1(){
        return "bean1";
    }

    @Bean
    //@Qualifier("bean2")
    //@Autowired(required = false)
    String bean2(){
        return "bean2";
    }

    @Bean
    //@Qualifier("bean3")
   // @Autowired(required = false)
    String bean3(){
        return "bean3";
    }
}
