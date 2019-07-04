package com.einnsyn.cosmodb.Parsing;

import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.impl.LinkedHashModel;
import org.eclipse.rdf4j.rio.*;
import org.eclipse.rdf4j.rio.helpers.StatementCollector;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class parser{
    public static void parseTEST() throws IOException {

        File fil = new File("C:\\Users\\camp-tvy\\Documents\\Test\\log_sample.ttl");
        InputStream inputStream = new FileInputStream(fil);
        System.out.println("Lest fil");

        //Finne filformat
        //RDFFormat format = Rio.getParserFormatForFileName(fil.toString()).orElse(RDFFormat.RDFXML);
        //System.out.println(format);

        //Lage RDFParser
        RDFParser rdfParser = Rio.createParser(RDFFormat.TURTLE);
        //RDFParser rdfParser = Rio.createParser(format);
        System.out.println("Laget parser");

        //RDFHandler
        Model model = new LinkedHashModel();
        rdfParser.setRDFHandler(new StatementCollector(model));
        System.out.println("Laget Handler");


        //Work
        try {
            rdfParser.parse(inputStream, fil.toString());
            System.out.println("Tried");
        } catch (IOException e) {
            // handle IO problems (e.g. the file could not be read)
            System.out.println("IO problems");
        } catch (RDFParseException e) {
            // handle unrecoverable parse error
            System.out.println("unrecoverable parse error");
        } catch (RDFHandlerException e) {
            // handle a problem encountered by the RDFHandler
            System.out.println("a problem encountered by the RDFHandler");
        } finally {
            inputStream.close();
        }
    }
}