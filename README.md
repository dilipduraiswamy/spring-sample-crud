# Spring Boot

#### Spring Boot Internal Working
Spring jar is developed by spring developer team , which contains the /META-INF/spring.factories file , which is used to enable / disable certain functionality ( i.e @Configuration and @Conditional )  at run time.

@SpringBootApplication is a combination of @Configuration + @EnableAutoConfiguration + @ComponentScan
SpringApplication.run()
- Method starts the main method of the application
- Searches for @Configuration
- Initializes the beans based on configuration
- Stores the beans in IOC Container(i.e JVM)
- After bean creation automatically configures the dispatcherservlet
- Registers the default handler mappings for the application
