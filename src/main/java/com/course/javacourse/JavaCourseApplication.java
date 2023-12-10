package com.course.javacourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaCourseApplication.class, args);
		Calculator calc = new Calculator();
		System.out.println(calc.add(3,4));
		System.out.println(calc.sub(3.25, 5.7));
	}

}
