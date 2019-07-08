package com.thomas.parsingtest.Pinto;

//import com.complexible.common.graph.Graph;
import com.complexible.pinto.RDFMapper;
import lombok.extern.slf4j.Slf4j;
import org.openrdf.model.Model;
import org.openrdf.rio.RDFFormat;
import org.openrdf.rio.Rio;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.IOException;

@Slf4j
public class EitForsok {

    private static String file_location = "C:\\Users\\camp-tvy\\Documents\\ProsjektTest\\Data\\kortfil.ttl";

    public static void testtest() throws IOException {

        Resource turtle_file = new FileSystemResource(file_location);

        Model model = Rio.parse(turtle_file.getInputStream(), "", RDFFormat.TURTLE);

        //Model graph = RDFMapper.create().writeValue(new Journalpost());

        //Journalpost journalpost = RDFMapper.create().readValue(model, Journalpost.class);
        //graph.toString();
        //journalpost.toString();
    }

}
