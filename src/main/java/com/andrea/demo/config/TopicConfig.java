package com.andrea.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

@Configurable
public class TopicConfig {

    @Bean
    public NewTopic myTopic(){
        return TopicBuilder.name("demoguides").build();
    }
    @Bean
    public NewTopic demoguidesJson(){
        return TopicBuilder.name("demoguides_json").build();
    }


}
