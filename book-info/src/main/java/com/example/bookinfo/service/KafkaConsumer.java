package com.example.bookinfo.service;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumer {


    @KafkaListener(topics="quantity-update",groupId="tmax-test",containerFactory = "listener")
    public void consume(JSONObject jsonObject){
        System.out.printf("Consumed message: ", jsonObject);
    }
}
