package com.example.microservices.springcloudzookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController

public class SpringCloudZookeeperApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZookeeperApplication.class, args);
	}

	@RequestMapping(value="/helloworld", method = RequestMethod.GET)
	public String helloWorld() {
		return "Hello World!";
	}

}
