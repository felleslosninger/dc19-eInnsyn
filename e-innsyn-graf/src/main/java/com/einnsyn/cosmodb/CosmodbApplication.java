package com.einnsyn.cosmodb;

import com.einnsyn.cosmodb.packages.Dokumentbeskrivelse.Dokumentbeskrivelse;
import com.einnsyn.cosmodb.packages.Dokumentbeskrivelse.DokumentbeskrivelseGraphRepository;
import com.einnsyn.cosmodb.packages.Dokumentbeskrivelse.DokumentbeskrivelseRepository;
import com.einnsyn.cosmodb.packages.Dokumentobjekt.DokumentobjektGraphRepository;
import com.einnsyn.cosmodb.packages.Dokumentobjekt.DokumentobjektRepository;
import com.einnsyn.cosmodb.packages.Journalpost.Journalpost;
import com.einnsyn.cosmodb.packages.Journalpost.JournalpostGraphRepository;
import com.einnsyn.cosmodb.packages.Journalpost.JournalpostRepository;
import com.einnsyn.cosmodb.packages.Korrespondansepart.KorrespondansepartGraphRepository;
import com.einnsyn.cosmodb.packages.Korrespondansepart.KorrespondansepartRepository;
import com.einnsyn.cosmodb.packages.Mappe.MappeGraphRepository;
import com.einnsyn.cosmodb.packages.Mappe.MappeRepository;
import com.einnsyn.cosmodb.packages.Registrering.RegistreringGraphRepository;
import com.einnsyn.cosmodb.packages.Registrering.RegistreringRepository;
import com.einnsyn.cosmodb.packages.Relation.RelationRepository;
import com.einnsyn.cosmodb.packages.Saksmappe.SaksmappeGraphRepository;
import com.einnsyn.cosmodb.packages.Saksmappe.SaksmappeRepository;
import com.einnsyn.cosmodb.packages.Skjerming.SkjermingGraphRepository;
import com.einnsyn.cosmodb.packages.Skjerming.SkjermingRepository;
import com.microsoft.spring.data.gremlin.query.GremlinTemplate;
import org.apache.tinkerpop.gremlin.driver.Client;
import org.apache.tinkerpop.gremlin.driver.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Objects;

@SpringBootApplication
public class CosmodbApplication {

    @Autowired
    private DokumentbeskrivelseRepository dokumentbeskrivelseRepository;
    @Autowired
    private DokumentbeskrivelseGraphRepository dokumentbeskrivelseGraphRepository;

    @Autowired
    private DokumentobjektRepository dokumentobjekRepository;
    @Autowired
    private DokumentobjektGraphRepository dokumentobjektGraphRepository;

    @Autowired
    private JournalpostRepository journalpostRepository;
    @Autowired
    private JournalpostGraphRepository journalpostGraphRepository;

    @Autowired
    private KorrespondansepartRepository korrespondansepartRepository;
    @Autowired
    private KorrespondansepartGraphRepository korrespondansepartGraphRepository;

    @Autowired
    private MappeRepository mappeRepository;
    @Autowired
    private MappeGraphRepository mappeGraphRepository;

    @Autowired
    private RegistreringRepository registreringRepository;
    @Autowired
    private RegistreringGraphRepository registreringGraphRepository;

    @Autowired
    private SaksmappeRepository relationRepository;
    @Autowired
    private SaksmappeGraphRepository saksmappeGraphRepository;

    @Autowired
    private SkjermingRepository skjermingRepository;
    @Autowired
    private SkjermingGraphRepository skjermingGraphRepository;

    private GremlinTemplate gremlinTemplate;

    public static void main(String[] args) {
        SpringApplication.run(CosmodbApplication.class, args);
    }

    private void cosmodb(){
        Client client =  gremlinTemplate.getGremlinClient();
        ResultSet rs = client.submit("g.V().haslabel('Person').out('Relation')");
        rs.stream().map(Objects::toString).forEach(System.out::println);
    }

}
