package com.sai.dynconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/demo")
public class ProductController {
	@Value("${message:default}")
	String message;
	@GetMapping
	public String getProduct(@RequestParam("name") String name) {
		return "Hello "+name+" "+this.message;
		
	}
}
