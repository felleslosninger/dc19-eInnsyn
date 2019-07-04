package com.thomas.parsingtest.Iterator;

import com.thomas.parsingtest.Models.*;
import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.Resource;
import org.eclipse.rdf4j.model.Statement;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;
import org.eclipse.rdf4j.rio.RDFParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Iteratorv2 {

    public static void iteratorv2() throws IOException {

        InputStream in = new FileInputStream(new File("C:\\Users\\camp-rgu\\Documents\\Dumpfil\\litenfil.ttl"));
        String baseURI = in.toString();
        Model model = Rio.parse(in, baseURI, RDFFormat.TURTLE);


        System.out.println(model.toArray()[1].toString());

        for (Statement st : model) {
            Resource subject = st.getSubject();

            //System.out.println("The predicate: " + st.getPredicate().toString());


            if (subject instanceof IRI) {
                //Tar siste del av subject
                System.out.println("LocalName: " + ((IRI) subject).getLocalName());
                //Tar første del/namespace av subject
                System.out.println("Namespace: " + ((IRI) subject).getNamespace());
                //Tar heile subject
                System.out.println("Subject toString: " + subject.toString());
                //Tar heile subject
                System.out.println("Stringvalue: " + subject.stringValue());
                //System.out.println("Type off: " + (subject.stringValue();
                if ((((IRI) subject).getLocalName()).contains("Journalpost")) {
                    System.out.println("contains(\"Journalpost\")");
                }
            } else {

            }
        }
    }
}
