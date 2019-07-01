package com.thomas.parsingtest.Iterator;

import com.thomas.parsingtest.Models.*;
import org.apache.tomcat.jni.Global;
import org.eclipse.rdf4j.RDF4JException;
import org.eclipse.rdf4j.model.Statement;
import org.eclipse.rdf4j.query.GraphQueryResult;
import org.eclipse.rdf4j.query.QueryResult;
import org.eclipse.rdf4j.query.QueryResults;
import org.eclipse.rdf4j.rio.RDFFormat;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Iteratorv1 {

    private static Journalpost jp;

    public static void iteratorv1() throws RDF4JException, IOException {

        File fil = new File("C:\\Users\\camp-tvy\\Documents\\ProsjektTest\\Data\\kortfil.ttl");
        InputStream inputStream = new FileInputStream(fil);
        System.out.println("Finner fil");

        String baseURI = fil.toString();
        RDFFormat format = RDFFormat.TURTLE;

        try (GraphQueryResult res = QueryResults.parseGraphBackground(inputStream, baseURI, format)) {
            while (res.hasNext()) {
                Statement st = res.next();
                useStatements(st);
            }
            if (!res.hasNext()) {
                System.out.println("Har ikkje next");
            }
        } catch (Exception e) {
            System.out.println("Unrecoverable error");
        } finally {
            inputStream.close();
        }
    }

    public static void useStatements(Statement st) {

        String obj = String.valueOf(st.getObject());
        String pred = String.valueOf(st.getPredicate());
        //System.out.println("Temp: " + temp.substring(58));
        //System.out.println("temp: " + temp);
        //System.out.println("Object: "+ st.getObject());
        //System.out.println("Subject: " + st.getSubject());
        System.out.println("Tostring: " + st.toString());
        System.out.println("Stringvalue: " + st.getObject().stringValue());

        if (obj.equals("http://www.arkivverket.no/standarder/noark5/arkivstruktur/Journalpost")) {
            Journalpost jp = new Journalpost();
            System.out.println("Journalpost created");
        }
        if (pred.contains("registreringsID")) {
            jp.setRegistreringsID(Long.parseLong(st.getObject().stringValue()));
            System.out.println("RegistreringsID registrert ;)");
        } else if (pred.contains("offentligTittel")) {
            jp.setOffentligTittel(String.valueOf((Long.parseLong(st.getObject().stringValue()))));
            System.out.println("RegistreringsID registrert ;)");
        }
    }
}
