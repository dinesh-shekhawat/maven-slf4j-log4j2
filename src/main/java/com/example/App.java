package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		try {
			LOGGER.info("Hello world...");
			int x = 1 / 0;
			System.exit(0);	
		} catch (Exception e) {
			LOGGER.error("Exception: {}", e.getMessage(), e);
			System.exit(1);
		}
		
	}
}
