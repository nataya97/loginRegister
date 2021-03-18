package at.dke.service.loginRegister.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {

    public static final Logger log = LoggerFactory.getLogger(KafkaTopicConfig.class);

    @Value(value = "${kafka.address}")
    private String address;

    /*@Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, address);
        return new KafkaAdmin(configs);
    }*/

    @Bean
    public NewTopic topic1() {
        log.info("creating new topic1");
        return new NewTopic("login", 1, (short) 1);
    }

    @Bean
    public NewTopic topic2() {
        log.info("creating new topic2");
        return new NewTopic("register", 1, (short) 1);
    }
}
