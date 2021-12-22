package com.simplilearn.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics="simplilearn", groupId="consumer1")
	public void consume(String message) {
		System.out.println("Consumed message = " + message);
	}
	
	@KafkaListener(topics="simplilearn", groupId="consumer2")
	public void consume2(String message) {
		System.out.println("Consumed message2 = " + message);
	}

}
