package at.dke.service.loginRegister.messaging;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
public class Consumer {

    @KafkaListener(topics = "login, register", groupId = "kafka.groupId")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }
}
