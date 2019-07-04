package com.thomas.pintothehorse;

import com.complexible.pinto.RDFMapper;
import com.complexible.stardog.plan.filter.functions.numeric.E;
import com.thomas.pintothehorse.Journalpost;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.Statement;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;
import org.openrdf.rio.turtle.TurtleWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;


public class pinto {

    private static String file_location = "C:\\Users\\camp-tvy\\Documents\\ProsjektTest\\Data\\kortfil.ttl";

    public static void PintoToTurtle() {

        Journalpost journalpost = new Journalpost();

        org.openrdf.model.Model model = RDFMapper.create().writeValue(journalpost);
        TurtleWriter tw = new TurtleWriter(System.out);

        tw.startRDF();
        model.getNamespaces().stream().forEach(ns -> tw.handleNamespace(ns.getPrefix(), ns.getName()));
        model.stream().forEach(tw::handleStatement);

        tw.endRDF();
        journalpost.toString();
    }
}
