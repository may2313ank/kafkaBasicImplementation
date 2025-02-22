package com.mayank.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mayank.kafka.service.KafkaProducer;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

	 @Autowired
	    private KafkaProducer kafkaProducer;

	    @PostMapping("/send")
	    public void sendMessage(@RequestParam("message") String message) {
	        kafkaProducer.sendMessage(message);
	    }
}



//C:\kafka_2.13-3.1.2>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

//C:\kafka_2.13-3.1.2>.\bin\windows\kafka-server-start.bat .\config\server.properties

//C:\kafka_2.13-3.1.2\bin\windows>kafka-topics.bat --create --bootstrap-server localhost:9092 --topic my-topic

//C:\kafka_2.13-3.1.2\bin\windows>kafka-console-producer.bat  --broker-list localhost:9092 --topic my-topic

//C:\kafka_2.13-3.1.2\bin\windows>kafka-console-consumer.bat --topic my-topic --bootstrap-server localhost:9093 --from-beginning

