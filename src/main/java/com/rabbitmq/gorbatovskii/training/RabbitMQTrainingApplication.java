package com.rabbitmq.gorbatovskii.training;

import com.rabbitmq.gorbatovskii.training.model.SimpleMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMQTrainingApplication implements CommandLineRunner {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public static void main(String[] args) {
        SpringApplication.run(RabbitMQTrainingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        final SimpleMessage simpleMessage = new SimpleMessage("Simple Name", "Simple Description");

        this.rabbitTemplate.convertAndSend(
            "TestExchange", "TestRouting", simpleMessage
        );
    }
}
