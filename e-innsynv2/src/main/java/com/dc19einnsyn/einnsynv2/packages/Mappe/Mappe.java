package com.dc19einnsyn.einnsynv2.packages.Mappe;


import com.dc19einnsyn.einnsynv2.packages.Registrering.Registrering;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
public class Mappe {
    public Set<Registrering> getRegistrering() {
        return registrering;
    }

    public void setRegistrering(Set<Registrering> registrering) {
        this.registrering = registrering;
    }

    public String getSkjerming() {
        return skjerming;
    }

    public void setSkjerming(String skjerming) {
        this.skjerming = skjerming;
    }

    @OneToMany(
            mappedBy = "mappe",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Registrering> registrering;

    @Id
    @GeneratedValue
    private Long mappeID;

    private String systemID;
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
    private String skjerming; //Class Maybe reset gets/sets
    private String Mappe; //Class
    //private String Registrering; //Class
    private String Saksmappe; //Class
    private String Journalpost; //Class

    public Mappe(Set<Registrering> registrering, String systemID, String tittel, String offentligTittel, String beskrivelse, String noekkelord, String dokumentmedium, String oppbevaringssted, String opprettetDato, String opprettetAv, String avsluttetDato, String avsluttetAv, String referanseArkivdel, String virksomhetsspesifikkeMetadata, String kryssreferanse, String merknad, String kassasjon, String gradering, String skjerming, String mappe, String saksmappe, String journalpost) {
        this.registrering = registrering;
        this.systemID = systemID;
        this.tittel = tittel;
        this.offentligTittel = offentligTittel;
        this.beskrivelse = beskrivelse;
        this.noekkelord = noekkelord;
        this.dokumentmedium = dokumentmedium;
        this.oppbevaringssted = oppbevaringssted;
        this.opprettetDato = opprettetDato;
        this.opprettetAv = opprettetAv;
        this.avsluttetDato = avsluttetDato;
        this.avsluttetAv = avsluttetAv;
        this.referanseArkivdel = referanseArkivdel;
        this.virksomhetsspesifikkeMetadata = virksomhetsspesifikkeMetadata;
        this.kryssreferanse = kryssreferanse;
        this.merknad = merknad;
        this.kassasjon = kassasjon;
        this.gradering = gradering;
        this.skjerming = skjerming;
        Mappe = mappe;
        Saksmappe = saksmappe;
        Journalpost = journalpost;
    }
/*
    public Mappe(String systemID, String tittel, String offentligTittel, String beskrivelse, String noekkelord, String dokumentmedium, String oppbevaringssted, String opprettetDato, String opprettetAv, String avsluttetDato, String avsluttetAv, String referanseArkivdel, String virksomhetsspesifikkeMetadata, String kryssreferanse, String merknad, String kassasjon, String gradering, String skjerming, String mappe, String registrering, String saksmappe, String journalpost) {
        this.systemID = systemID;
        this.tittel = tittel;
        this.offentligTittel = offentligTittel;
        this.beskrivelse = beskrivelse;
        this.noekkelord = noekkelord;
        this.dokumentmedium = dokumentmedium;
        this.oppbevaringssted = oppbevaringssted;
        this.opprettetDato = opprettetDato;
        this.opprettetAv = opprettetAv;
        this.avsluttetDato = avsluttetDato;
        this.avsluttetAv = avsluttetAv;
        this.referanseArkivdel = referanseArkivdel;
        this.virksomhetsspesifikkeMetadata = virksomhetsspesifikkeMetadata;
        this.kryssreferanse = kryssreferanse;
        this.merknad = merknad;
        this.kassasjon = kassasjon;
        this.gradering = gradering;
        this.skjerming = skjerming;
       Mappe = mappe;
       //Registrering = registrering;
       Saksmappe = saksmappe;
       Journalpost = journalpost;
    }
*/
    public Long getMappeID() {
        return mappeID;
    }

    public void setMappeID(Long mappeID) {
        this.mappeID = mappeID;
    }

    public String getSystemID() {
        return systemID;
    }

    public void setSystemID(String systemID) {
        this.systemID = systemID;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getOffentligTittel() {
        return offentligTittel;
    }

    public void setOffentligTittel(String offentligTittel) {
        this.offentligTittel = offentligTittel;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public String getNoekkelord() {
        return noekkelord;
    }

    public void setNoekkelord(String noekkelord) {
        this.noekkelord = noekkelord;
    }

    public String getDokumentmedium() {
        return dokumentmedium;
    }

    public void setDokumentmedium(String dokumentmedium) {
        this.dokumentmedium = dokumentmedium;
    }

    public String getOppbevaringssted() {
        return oppbevaringssted;
    }

    public void setOppbevaringssted(String oppbevaringssted) {
        this.oppbevaringssted = oppbevaringssted;
    }

    public String getOpprettetDato() {
        return opprettetDato;
    }

    public void setOpprettetDato(String opprettetDato) {
        this.opprettetDato = opprettetDato;
    }

    public String getOpprettetAv() {
        return opprettetAv;
    }

    public void setOpprettetAv(String opprettetAv) {
        this.opprettetAv = opprettetAv;
    }

    public String getAvsluttetDato() {
        return avsluttetDato;
    }

    public void setAvsluttetDato(String avsluttetDato) {
        this.avsluttetDato = avsluttetDato;
    }

    public String getAvsluttetAv() {
        return avsluttetAv;
    }

    public void setAvsluttetAv(String avsluttetAv) {
        this.avsluttetAv = avsluttetAv;
    }

    public String getReferanseArkivdel() {
        return referanseArkivdel;
    }

    public void setReferanseArkivdel(String referanseArkivdel) {
        this.referanseArkivdel = referanseArkivdel;
    }

    public String getVirksomhetsspesifikkeMetadata() {
        return virksomhetsspesifikkeMetadata;
    }

    public void setVirksomhetsspesifikkeMetadata(String virksomhetsspesifikkeMetadata) {
        this.virksomhetsspesifikkeMetadata = virksomhetsspesifikkeMetadata;
    }

    public String getKryssreferanse() {
        return kryssreferanse;
    }

    public void setKryssreferanse(String kryssreferanse) {
        this.kryssreferanse = kryssreferanse;
    }

    public String getMerknad() {
        return merknad;
    }

    public void setMerknad(String merknad) {
        this.merknad = merknad;
    }

    public String getKassasjon() {
        return kassasjon;
    }

    public void setKassasjon(String kassasjon) {
        this.kassasjon = kassasjon;
    }

    public String getGradering() {
        return gradering;
    }

    public void setGradering(String gradering) {
        this.gradering = gradering;
    }

    /*public String getSkjerming() {
        return skjerming;
    }

    public void setSkjerming(String skjerming) {
        this.skjerming = skjerming;
    }
*/
    public String getMappe() {
        return Mappe;
    }

    public void setMappe(String mappe) {
        Mappe = mappe;
    }

    /*public String getRegistrering() {
        return Registrering;
    }

    public void setRegistrering(String registrering) {
        Registrering = registrering;
    }
*/
    public String getSaksmappe() {
        return Saksmappe;
    }

    public void setSaksmappe(String saksmappe) {
        Saksmappe = saksmappe;
    }

    public String getJournalpost() {
        return Journalpost;
    }

    public void setJournalpost(String journalpost) {
        Journalpost = journalpost;
    }


    //private Skjerming skjerming;
    // private Mappe mappe;
    // private Set<Registrering> registrering;
    //private Set<Saksmappe> saksmapper;
    //private Set<Journalpost> jounalposter;
}
