package com.mayank.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private String topic = "my-topic";

    public void sendMessage(String message) {
        kafkaTemplate.send(topic, message);
    }
}

