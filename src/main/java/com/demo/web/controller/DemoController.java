package com.demo.web.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demos")
public class DemoController {
	
	@GetMapping("/")
	public String helloWorld() {
		return "Hello Spring Web World!";		
	}

	// duplicate mapping error
//	@GetMapping("/")
//	public String helloAnotherWorld() {
//		return "Hello Another Spring Web World!";		
//	}

	//	@GetMapping("")
//	public String helloWorld(@RequestParam String name) {
//		return "Hello " + name + "!";		
//	}

	@GetMapping("")
	public String helloWorld(@RequestParam(defaultValue="first") String fName, 
			@RequestParam(defaultValue="last")String lName) {
		return "Hello " + fName + " " + lName + "!";		
	}
	
	@GetMapping("/{id}")
	public String helloNumber(@PathVariable int id) {
		return "The number is: "+ id;
	}
}
