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

    @Autowired
    public static void readTurtle(File f) throws IOException{
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String line;

        String pattern = ".* a arkiv:Journalpost ;";

        while((line = br.readLine()) != null){

            if (line.matches(pattern)){ //finds all journalposts
                System.out.println(line);
                for (int i = 0;i<13;i++){
                    String attrLine = br.readLine();
                    System.out.println(attrLine);
                }
                System.out.println("");
                System.out.println("");
            }

        }
        br.close();
        fr.close();
    }

}
