package com.dificampeinnsyn.einnsynweb.readFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@Component
public class readLines {

    @Autowired
    public static void readLine(File f) throws IOException{
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
        fr.close();
    }

}
