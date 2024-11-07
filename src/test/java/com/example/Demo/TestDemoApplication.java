package com.example.Demo;

import org.springframework.boot.SpringApplication;

import com.example.demo.DemoApplication;

public class TestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(DemoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
