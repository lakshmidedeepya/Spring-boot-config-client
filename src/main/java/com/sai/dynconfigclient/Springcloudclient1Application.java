package com.sai.dynconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableDiscoveryClient
public class Springcloudclient1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springcloudclient1Application.class, args);
	}

}
