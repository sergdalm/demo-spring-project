package com.example.demo;

import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var applicationContext = SpringApplication.run(DemoApplication.class, args);
		var service = applicationContext.getBean(UserService.class);
		var users = service.findAll();
		log.info("All users: {}", users);
	}

}
