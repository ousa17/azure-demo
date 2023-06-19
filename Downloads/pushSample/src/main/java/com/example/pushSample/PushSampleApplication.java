package com.example.pushSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MessageProperties.class)
public class PushSampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(PushSampleApplication.class, args);
	}
}
