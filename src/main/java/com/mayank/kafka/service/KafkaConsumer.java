package com.mayank.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	 @KafkaListener(topics = "my-topic", groupId = "my-group")
	    public void consume(String message) {
	        System.out.println("Consumed message: " + message);
	    }
}
