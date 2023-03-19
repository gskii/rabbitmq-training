package com.rabbitmq.gorbatovskii.training.app.consumer;

import com.rabbitmq.gorbatovskii.training.app.producer.RabbitMQProducerApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class RabbitMQConsumerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMQConsumerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
