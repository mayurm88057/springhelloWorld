package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	@RequestMapping("/")
	public String helloWorld() {
		return"Welcome to my First Spring boot";
	}

}
 