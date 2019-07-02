package com.dc19einnsyn.einnsynv2.packages.Mappe;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Mappe {

    private String systemID;

    @Id
    private long mappeID;

    private String tittel;
    private String offentligTittel;
    private String beskrivelse;
    private String noekkelord;
    private String dokumentmedium;
    private String oppbevaringssted;
    private String opprettetDato;
    private String opprettetAv;
    private String avsluttetDato;
    private String avsluttetAv;
    private String referanseArkivdel;
    private String virksomhetsspesifikkeMetadata;
    private String kryssreferanse;
    private String merknad;
    private String kassasjon;
    private String gradering;


    //private Skjerming skjerming;
    // private Mappe mappe;
    // private Set<Registrering> registrering;
    //private Set<Saksmappe> saksmapper;
    //private Set<Journalpost> jounalposter;
}
