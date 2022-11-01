package com.example.demo;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    private final String topicName = "testTopic";
    @Bean
    public NewTopic createTopic() {
        return TopicBuilder.name(topicName).partitions(5).build();
    }
}
