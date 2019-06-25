package com.dc19einnsyn.einnsynv2.Models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Set;

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

    private String registreringsID;
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


    Set<Korrespondansepart> korrespondanseparter;
    Set<Dokumentbeskrivelse> dokumentbeskrivelser;
    Set<Skjerming> skjerminger;
}
