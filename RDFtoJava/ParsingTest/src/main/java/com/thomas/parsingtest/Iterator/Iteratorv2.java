package com.thomas.parsingtest.Iterator;

import com.thomas.parsingtest.Models.*;
import org.eclipse.rdf4j.model.*;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;
import com.complexible.pinto.RDFMapper;
import org.eclipse.rdf4j.rio.RDFParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Iteratorv2 {

    public static void iteratorv2() throws IOException {

        Boolean alreadyStated = false;
        InputStream in = new FileInputStream(new File("C:\\Users\\camp-rgu\\Documents\\Dumpfil\\utdrag.ttl"));
        String baseURI = in.toString();
        Model model = Rio.parse(in, baseURI, RDFFormat.TURTLE);


        System.out.println(model.toArray()[1].toString());
        List<Statement> fornow = new ArrayList<Statement>();
        List<List<Statement>> listet = new ArrayList<List<Statement>>();


        for (Statement st : model) {
            if (fornow.isEmpty()){
                fornow.add(st);
            }else if (st.getSubject().stringValue().equals(fornow.get(0).getSubject().stringValue())){
                fornow.add(st);
            }else {
                System.out.println("Inne 3 ny");
                System.out.println("fornow før listet: " + fornow.toString());
                System.out.println("LISTET før FORNOW: " + listet.toString());
                listet.add(fornow);
                System.out.println("LISTET: " + listet.toString());
                fornow.clear();
                System.out.println("fornow ETTER listet: " + fornow.toString());
                fornow.add(st);
            }
        }
        System.out.println("----------------------");
        System.out.println(listet.toString());
        System.out.println("----------------------");

        for (List<Statement> lis : listet){
            for (Statement stat : lis){
                System.out.println("Her er objektet: " + stat.getObject().stringValue());
            }
        }

//            if (st.getSubject().equals(subject)) {
//
//
//                //Tar siste del av subject
//                System.out.println("LocalName: " + ((IRI) subject).getLocalName());
//                //Tar første del/namespace av subject
//                System.out.println("Namespace: " + ((IRI) subject).getNamespace());
//                //Tar heile subject
//                System.out.println("Subject toString: " + subject.toString());
//                //Tar heile subject
//                System.out.println("Stringvalue: " + st.getObject().stringValue());
//                //System.out.println("Type off: " + (subject.stringValue();
//                System.out.println("Object StringValue: " + st.getObject().stringValue());
//                if (st.getObject().stringValue().contains("Journalpost")) {
//                    System.out.println("contains(\"Journalpost\")");
//                }
//            } else {
//
//            }
    }
}
