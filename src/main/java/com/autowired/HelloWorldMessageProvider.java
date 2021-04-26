package com.autowired;

import org.springframework.stereotype.Component;


public class HelloWorldMessageProvider implements MessageProvider {
	@Override
	public String getMessage() {
		return "Hello World!";
	}
}
