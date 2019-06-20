package com.dificampeinnsyn.einnsynweb;

import com.dificampeinnsyn.einnsynweb.readFile.readLines;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;


@SpringBootApplication
public class EInnsynWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(EInnsynWebApplication.class, args);
        File f = new File("TEXT_FILES/minidata.txt");
        try {
            readLines.readLine(f);
        } catch (IOException e){
            e.printStackTrace();
        }

    }

}
