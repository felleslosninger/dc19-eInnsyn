package com.thomas.parsingtest.Models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.eclipse.rdf4j.model.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor

public class Registrering {
    private String systemID;
    private String opprettetDato;
    private String opprettetAv;
    private String arkivertDato;
    private String arkivertAv;
    private String referanseArkivdel;

    private String kassasjon;
    private String skjerming;
    private String gradering;

    private String dokumentbeskrivelse;
    private String dokumentobjekt;

    private String korrespondansepart;

    @Id
    private long registreringsID; //trur dette skal være en long

    private String tittel;
    private String offentligTittel;
    private String beskrivelse;
    private String noekkelord;
    private String forfatter;
    private String dokumentmedium;
    private String oppbevaringssted;
    private String virksomhetsspesifikkeMetadata;

    private String merknad;
    private String kryssreferanse;

    public void setParam(Model model, Registrering registrering) {

    }


    // Set<Korrespondansepart> korrespondanseparter;
    //Set<Dokumentbeskrivelse> dokumentbeskrivelser;
    //Set<Skjerming> skjerminger;
}
