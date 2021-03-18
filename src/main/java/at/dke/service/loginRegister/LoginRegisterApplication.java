package at.dke.service.loginRegister;

import at.dke.service.loginRegister.config.KafkaTopicConfig;
import at.dke.service.loginRegister.messaging.Publisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginRegisterApplication.class, args);
    }
}
