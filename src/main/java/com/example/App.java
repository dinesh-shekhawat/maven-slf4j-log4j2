package com.example;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		try {
			String filePath = "/home/dinesh/temp/json.txt";
			ObjectMapper mapper = new ObjectMapper();
			JsonNode jsonNode = mapper.readTree(new File(filePath));

			LOGGER.info("JSON Node: {}", jsonNode.toPrettyString());
			
			for (JsonNode node : jsonNode) {
                JsonNode waitNode = node.path("queues").path("wait");
                if (waitNode.isArray()) {
                    for (JsonNode item : waitNode) {
                        ((ObjectNode) item.path("criteria").get(0)).put("threshold", 50);
                    }
                }
            }

            // Print updated JSON node
			LOGGER.info("JSON after Node: {}", jsonNode.toPrettyString());
			
			System.exit(0);
		} catch (Exception e) {
			LOGGER.error("Exception: {}", e.getMessage(), e);
			System.exit(1);
		}
		
	}
}
