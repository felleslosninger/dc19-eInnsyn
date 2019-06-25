package com.dc19einnsyn.einnsynv2.Models;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;

@Entity(name = "tbl_person")
@Data
@NoArgsConstructor
public class Mappe {

    private String systemID;
    private String mappeID;
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
    private Skjerming skjerming;
    private Mappe mappe;
    private Set<Registrering> registrering;
    private Set<Saksmappe> saksmapper;
    private Set<Journalpost> jounalposter;
}
