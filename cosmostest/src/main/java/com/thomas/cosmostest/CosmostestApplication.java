package com.thomas.cosmostest;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.thomas.cosmostest.CosmosDbDemo;

import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class CosmostestApplication {

    public CosmostestApplication(){

    }
    public static void main(String[] args) {
        SpringApplication.run(CosmostestApplication.class, args);
        CosmosDbDemo cdd = new CosmosDbDemo();


    }

}
