package com.thomas.parsingtest.Iterator;

import com.thomas.parsingtest.Models.*;
import org.eclipse.rdf4j.model.*;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;
import com.complexible.pinto.RDFMapper;
import org.eclipse.rdf4j.rio.RDFParser;
import org.openrdf.rio.turtle.TurtleWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Iteratorv2 {

    public static void iteratorv2() throws IOException {

        InputStream in = new FileInputStream(new File("C:\\Users\\camp-rgu\\Documents\\Dumpfil\\utdrag.ttl"));
        String baseURI = in.toString();
        Model model = Rio.parse(in, "", RDFFormat.TURTLE);

        Model fornow = Rio.parse(new FileInputStream("C:\\Users\\camp-rgu\\Documents\\Dumpfil\\empty.ttl"), baseURI, RDFFormat.TURTLE);
        List<Model> listet = new ArrayList<Model>();
        String subj = "";



        for (Statement st : model) {
            if (subj.equals("")){
                fornow.add(st);
                subj = st.getSubject().stringValue();
            }else if (st.getSubject().stringValue().equals(subj)){
                fornow.add(st);
            }else {
                listet.add(fornow);
                fornow = Rio.parse(new FileInputStream("C:\\Users\\camp-rgu\\Documents\\Dumpfil\\empty.ttl"), baseURI, RDFFormat.TURTLE);
                fornow.add(st);
                subj = st.getSubject().stringValue();
            }
        }
        System.out.println("----------------------");
        System.out.println(listet.toString());
        System.out.println("----------------------");

        for (Model lis : listet){
            System.out.println("");
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

    private void marshalPintoToTurtle() {

        Journalpost journalpost = new Journalpost();

        final Journalpost journalpost1 = RDFMapper.create().readValue(model, Journalpost.class);

        TurtleWriter tw = new TurtleWriter(System.out);

        tw.startRDF();
        model.getNamespaces().stream().forEach(ns -> tw.handleNamespace(ns.getPrefix(), ns.getName()));
        model.stream().forEach(tw::handleStatement);
        tw.endRDF();
    }
}
