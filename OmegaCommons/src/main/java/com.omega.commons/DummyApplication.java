package com.omega.commons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is simply to get the Test repository to work. If find a way to do without that, we can remove this class.
 */
@SpringBootApplication
public class DummyApplication {


	public static void main(String[] args) {
		SpringApplication.run(DummyApplication.class, args);
	}
}
