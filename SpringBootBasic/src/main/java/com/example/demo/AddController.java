package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

	@GetMapping("/add")
	public Integer addNumbr(@RequestParam("number1") Integer number1, @RequestParam("number2") Integer number2) {
		return number1+number2;
	}
}
