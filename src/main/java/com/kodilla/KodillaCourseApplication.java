package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseApplication {

	public static void main(String[] args) {
		//SpringApplication.run(KodillaCourseApplication.class, args);
		Calculator calc = new Calculator();
		System.out.println("Calculator:");
		System.out.println("2 + 2 = " +calc.add(2,2));
		System.out.println("2 - 2 = " +calc.sub(2,2));
	}
}
