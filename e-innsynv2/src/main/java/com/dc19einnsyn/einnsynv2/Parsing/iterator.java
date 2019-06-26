package com.dc19einnsyn.einnsynv2.Parsing;

import org.eclipse.rdf4j.RDF4JException;
import org.eclipse.rdf4j.model.Statement;
import org.eclipse.rdf4j.query.GraphQueryResult;
import org.eclipse.rdf4j.query.QueryResults;
import org.eclipse.rdf4j.rio.RDFFormat;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class iterator {

    public static void iteratorTEST() throws RDF4JException, IOException {

        File fil = new File("C:\\Users\\camp-tvy\\Documents\\Test\\export_difi.ttl");
        InputStream inputStream = new FileInputStream(fil);
        System.out.println("Finner fil");

        String baseURI = fil.toString();
        RDFFormat format = RDFFormat.TURTLE;

        try(GraphQueryResult res = QueryResults.parseGraphBackground(inputStream, baseURI, format)){
            while (res.hasNext()){
                Statement st = res.next();
                System.out.println(st.toString());
            }
            if (!res.hasNext()){
                System.out.println("Har ikkje next");
            }
        } catch (Exception e){
            System.out.println("Unrecoverable error");
        } finally {
            inputStream.close();
        }
    }
}