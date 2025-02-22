package com.mayank.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mayank.kafka.service.KafkaProducer;

@RestController
public class KafkaController {

	 @Autowired
	    private KafkaProducer kafkaProducer;

	    @PostMapping("/send")
	    public void sendMessage(@RequestParam("message") String message) {
	        kafkaProducer.sendMessage(message);
	    }
}