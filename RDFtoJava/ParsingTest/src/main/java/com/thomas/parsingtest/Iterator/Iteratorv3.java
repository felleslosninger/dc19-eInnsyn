package com.thomas.parsingtest.Iterator;

import com.thomas.parsingtest.Models.*;
import org.eclipse.rdf4j.model.*;
import org.eclipse.rdf4j.model.impl.LinkedHashModel;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;


import static org.eclipse.rdf4j.model.vocabulary.RDF.TYPE;

public class Iteratorv3 {

    public static void iteratorv3() throws IOException {


        InputStream in = new FileInputStream(new File("C:\\Users\\camp-tvy\\Documents\\ProsjektTest\\Data\\kortfil.ttl"));

        String baseURI = in.toString();
        Model model = Rio.parse(in, baseURI, RDFFormat.TURTLE);
        boolean newStatement = true;


        for (Statement st : model) {
            System.out.println();
            IRI subject = st.getPredicate();
            Model tempModel = model.filter(null, subject, null);

            if (st.getObject().stringValue().contains("Journalpost")) {
                Journalpost jp = new Journalpost();
                jp.setParam(tempModel, jp);
                System.out.println();
            } else if (st.getObject().stringValue().contains("Ragistrering")) {
                Registrering registrering = new Registrering();
                registrering.setParam(tempModel, registrering);
            }


/*
            if (newStatement) {
                newStatement = false;
                Model tempModel = model.filter(null, subject, null);
                for (Statement statm : model.filter(null, subject, null)) {
                    if (st.getObject().stringValue().contains("Journalpost")){
                        Journalpost jp = new Journalpost();
                        jp.setParam(statm)
                    }else if (st.getObject().stringValue().contains("Ragistrering")){
                        Registrering registrering = new Registrering();
                    }

                }

 */
        }
        System.out.println(model.toString());
    }
}