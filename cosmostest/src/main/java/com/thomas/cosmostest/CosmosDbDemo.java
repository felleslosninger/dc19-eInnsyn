package com.thomas.cosmostest;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.stream.Stream;

@Log4j2
@Component
public class CosmosDbDemo {

    private final PersonRepository pr;

    CosmosDbDemo(PersonRepository pr){
        this.pr = pr;
    }

    @EventListener(ApplicationReadyEvent.class)
     public void demo() throws Exception {
        this.pr.deleteAll();

        Stream.of("A", "B", "C")
                .map(name -> new Person(UUID.randomUUID().toString(), "Test", "19"))
                .map(this.pr::save)
                .forEach(log::info);
    }
}
