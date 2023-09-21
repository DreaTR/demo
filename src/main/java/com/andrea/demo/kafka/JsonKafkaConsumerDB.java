package com.andrea.demo.kafka;


import com.andrea.demo.payload.User;

import com.andrea.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumerDB {

    @Autowired
    private UserRepository userRepository;

    @KafkaListener(topics = "demoguides_json", groupId = "otherGroup")
    public void writeToDB (User user){

        System.out.println(user);

        System.out.println("Skickar data till DB!");

        //Skicka data till DB
        userRepository.save(user);

    }

}
