package com.thomas.pintothehorse;

import com.complexible.common.graph.Graph;
import com.complexible.pinto.RDFMapper;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.Statement;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class readWithRDF4J {

    private static String file_location = "C:\\Users\\camp-tvy\\Documents\\ProsjektTest\\Data\\export_difi.ttl";

    public static void readTurtle() throws IOException{
        System.out.println("=======================================");
        System.out.println("Starting to parse file at " + file_location);
        System.out.println("=======================================");


        Resource turtle_file = new FileSystemResource(file_location);

        Model model = Rio.parse(turtle_file.getInputStream(), "", RDFFormat.TURTLE);


        for (Statement statement: model) {
            //System.out.println(statement.getPredicate());
            System.out.println(statement.getObject());
        }

        System.out.println("======================");
        System.out.println("Finished parsing file!");
        System.out.println("======================");
    }
}
