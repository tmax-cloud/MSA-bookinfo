package com.example.bookinfo.config;
import com.example.bookinfo.repo.BookRepo;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.kafka.annotation.KafkaListener;

import com.google.gson.Gson;


@Configuration
public class KafkaConfiguration {

    private static final Logger log = LoggerFactory.getLogger(KafkaConfiguration.class);
    @Autowired(required = true)
    @Qualifier("BookRepo")
    private BookRepo bookRepo;
    @KafkaListener(id = "tmax-test", topics = "quantity-update")
    public void listen(String in) {
        Gson g = new Gson();
        try {
            JSONObject jsonObject = g.fromJson(in, JSONObject.class);
            System.out.println("consumed message==" + jsonObject);
            log.info(in + " kafka consumer");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}