package com.javaonlyjava.demoActiveMQ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class DemoActiveMqApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(DemoActiveMqApplication.class, args);
		JmsTemplate jms = ctx.getBean(JmsTemplate.class);
		jms.convertAndSend("javaonlyjava", "My first test message in activeMQ");
	}

}
