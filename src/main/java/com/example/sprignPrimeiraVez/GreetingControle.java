package com.example.sprignPrimeiraVez;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class GreetingControle {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Word") String name) {
		return new  Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	/*@RequestMapping("")
	public Greeting greetingName(@RequestParam(value = "name", defaultValue = "Word") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	*/
}
