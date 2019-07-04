package com.thomas.parsingtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;


import static com.thomas.parsingtest.Iterator.Iteratorv2.iteratorv2;

@SpringBootApplication
public class ParsingApplication {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(ParsingApplication.class, args);
        //iteratorv1();
        iteratorv2();
        //iteratorv3();


    }
}

