package com.zig.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Myfi1Application {

	public static void main(String[] args) {
		  ConfigurableApplicationContext context = SpringApplication.run(Myfi1Application.class, args);
		  Alian obj = context.getBean(Alian.class);
		  obj.code();
	}

}
