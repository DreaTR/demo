package com.andrea.demo.kafka;

import com.andrea.demo.payload.User;
import com.andrea.demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final org.slf4j.Logger Logger = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @Autowired
    private UserRepository userRepository;

    @KafkaListener(topics = "demoguides_json", groupId = "myGroup")
    public void consumer(User user){
        Logger.info(String.format("Json message recieved -> %s", user.toString()));

        /*
        System.out.println(user);

        System.out.println("Skickar data till DB!");

        //Skicka data till DB
        userRepository.save(user);

         */

    }


}
