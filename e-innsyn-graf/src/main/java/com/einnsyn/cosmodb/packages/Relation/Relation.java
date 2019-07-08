package com.einnsyn.cosmodb.packages.Relation;


import com.einnsyn.cosmodb.packages.Dokumentbeskrivelse.Dokumentbeskrivelse;
import com.einnsyn.cosmodb.packages.Dokumentobjekt.Dokumentobjekt;
import com.einnsyn.cosmodb.packages.Journalpost.Journalpost;
import com.einnsyn.cosmodb.packages.Korrespondansepart.Korrespondansepart;
import com.einnsyn.cosmodb.packages.Mappe.Mappe;
import com.einnsyn.cosmodb.packages.Registrering.Registrering;
import com.einnsyn.cosmodb.packages.Saksmappe.Saksmappe;
import com.einnsyn.cosmodb.packages.Skjerming.Skjerming;
import com.microsoft.spring.data.gremlin.annotation.Edge;
import com.microsoft.spring.data.gremlin.annotation.EdgeFrom;
import com.microsoft.spring.data.gremlin.annotation.EdgeTo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Edge
public class Relation {

    @Id
    private String id;

    private String name;


    //FROM
    @EdgeFrom
    private Dokumentbeskrivelse dokumentbeskrivelseFrom;

    @EdgeFrom
    private Dokumentobjekt dokumentobjektFrom;

    @EdgeFrom
    private Journalpost JournalpostFrom;

    @EdgeFrom
    private Korrespondansepart korrespondansepartFrom;

    @EdgeFrom
    private Mappe mappeFrom;

    @EdgeFrom
    private Registrering registreringFrom;

    @EdgeFrom
    private Saksmappe saksmappeFrom;

    @EdgeFrom
    private Skjerming skjermingFrom;


    //TO
    @EdgeTo
    private Dokumentbeskrivelse dokumentbeskrivelseTo;

    @EdgeTo
    private Dokumentobjekt dokumentobjektTo;

    @EdgeTo
    private Journalpost journalpostTo;

    @EdgeTo
    private Korrespondansepart korrespondansepartTo;

    @EdgeTo
    private Mappe mappeTo;

    @EdgeTo
    private Registrering registreringTo;

    @EdgeTo
    private Saksmappe saksmappeTo;

    @EdgeTo
    private Skjerming skjermingTo;
}
