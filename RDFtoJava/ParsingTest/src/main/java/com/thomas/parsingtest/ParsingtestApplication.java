package com.thomas.parsingtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;


import static com.thomas.parsingtest.Convert.HowToConvertRdfToJson.convertRdfToPrettyJson;
import static com.thomas.parsingtest.Iterator.Iteratorv1.iteratorv1;
import static com.thomas.parsingtest.Iterator.Iteratorv2.iteratorv2;
import static com.thomas.parsingtest.Iterator.Iteratorv3.iteratorv3;

@SpringBootApplication
public class ParsingtestApplication {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(ParsingtestApplication.class, args);
        //iteratorv1();
        //iteratorv2();
        //iteratorv3();
        convertRdfToPrettyJson();


    }
}
