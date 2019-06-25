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
                String attrLine;
                String location;
                String temp[];

                temp = line.split(" ");
                location = temp[0].substring(1,temp[0].length()-1);

                String attrPattern = "(.*> \\.)|(.*> ;)|(.* ;)"; //correct atm.
                String attrSplitPattern = "arkiv:.*? ";
                String attrSplitPatternSpecial = " ";
                String specialCase = "arkiv:journalposttype.*";
                String numberPattern = "^\\d.+";
                //sql insert statement here
                for (int i = 0;i<13;i++){ //attributes
                    if((attrLine = br.readLine()).matches(attrPattern) && attrLine != "") {
                        if(attrLine.contains("arkiv:journalposttype")){
                            String jPTypeTemp[] = attrLine.split(" ");
                            String jPType = jPTypeTemp[1];

                            System.out.println(jPType);
                        } else {
                                String superTemp[] = attrLine.split(attrSplitPattern);
                            try {
                                String valueTemp = superTemp[1];
                                String StringValue = valueTemp.substring(0,valueTemp.length()-2);

                                if (StringValue.matches(numberPattern)){
                                    int value = Integer.parseInt(StringValue);
                                    System.out.println(value);

                                }  else {
                                    String value = StringValue;
                                    System.out.println(value);
                                }

                            } catch(Exception e){

                            }

                        }

                    //sql insert statement here
                    }
                }
                System.out.println("END OF OBJECT");
                System.out.println("");
            }

        }
        br.close();
        fr.close();
    }

}
