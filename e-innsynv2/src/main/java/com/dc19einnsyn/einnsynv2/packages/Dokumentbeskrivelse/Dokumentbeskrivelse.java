package com.dc19einnsyn.einnsynv2.packages.Dokumentbeskrivelse;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Dokumentbeskrivelse {

    public Dokumentbeskrivelse(Long dokumentBeskrivelseId, String tittel, String beskrivelse, String forfatter) {
        this.dokumentBeskrivelseId = dokumentBeskrivelseId; //skal fekk etter db connect
        this.tittel = tittel;
        this.beskrivelse = beskrivelse;
        this.forfatter = forfatter;
    }

    //@GeneratedValue after db connect
    @Id
    @GeneratedValue
    private Long dokumentBeskrivelseId;

    private String tittel;
    private String beskrivelse;
    private String forfatter;


    public Long getDokumentBeskrivelseId() {
        return dokumentBeskrivelseId;
    }

    public void setDokumentBeskrivelseId(Long dokumentBeskrivelseId) {
        this.dokumentBeskrivelseId = dokumentBeskrivelseId;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

}