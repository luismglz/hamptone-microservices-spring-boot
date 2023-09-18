package com.ruisu.hamptoneeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HamptoneEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HamptoneEurekaApplication.class, args);
	}

}
