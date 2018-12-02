package com.song.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.song.client"})
public class DemoRestConsumeApplication{

	public static void main(String[] args) {
		SpringApplication.run(DemoRestConsumeApplication.class, args);
	}
}
