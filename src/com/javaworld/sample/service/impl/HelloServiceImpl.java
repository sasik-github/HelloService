package com.javaworld.sample.service.impl;

import com.javaworld.sample.helloservice.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello() {
		System.out.println("Inside HelloServiceImple.sayHello()");
		return "Say Hello";
	}

}
