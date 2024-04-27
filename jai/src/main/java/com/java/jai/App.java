package com.java.jai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
          ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        Alien obj = context.getBean(Alien.class);
        obj.code();
        
    }
}
