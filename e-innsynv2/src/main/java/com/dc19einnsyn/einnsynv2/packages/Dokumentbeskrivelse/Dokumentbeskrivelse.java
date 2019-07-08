package com.dc19einnsyn.einnsynv2.packages.Dokumentbeskrivelse;

import com.dc19einnsyn.einnsynv2.packages.Dokumentobjekt.Dokumentobjekt;
import com.dc19einnsyn.einnsynv2.packages.Mappe.Mappe;
import com.dc19einnsyn.einnsynv2.packages.Registrering.Registrering;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@NoArgsConstructor
public class Dokumentbeskrivelse {

    @ManyToOne
    @JoinColumn(name = "registrering_dokumentbeskrivelse")
    private Registrering registrering;

    @OneToMany(
            mappedBy = "dokumentbeskrivelse",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Dokumentobjekt> dokumentobjekt;
    //@Id
   // private Long registreringsID;


    //@GeneratedValue after db connect
    @Id
    @GeneratedValue
    private Long dokumentBeskrivelseId;

    private String systemID;
    private String dokumentType;
    private String dokumentStatus;
    private String tittel;
    private String beskrivelse;
    private String forfatter;
    private String opprettetDato;
    private String opprettetAv;
    private String dokumentMedium;
    private String oppbevaringssted;
    private String referanseArkivedel;
    private String tilknyttetRegistreringSom;
    private Long dokumentNummer;
    private Date tilknyttetDato;
    private String tilknyttetAv;

    private String merknad;
    private String kassasjon;
    private String utfoertKassasjon;
    private String sletting;
    private String skjerming; // Class
    private String gradering; // Class but not in simplified format.
    private String elektroniskSignatur;
    //private String dokumentobjekt; // Class


    public Dokumentbeskrivelse(String systemID, String dokumentType, String dokumentStatus, String tittel, String beskrivelse, String forfatter, String opprettetDato, String opprettetAv, String dokumentMedium, String oppbevaringssted, String referanseArkivedel, String tilknyttetRegistreringSom, Long dokumentNummer, Date tilknyttetDato, String tilknyttetAv, String merknad, String kassasjon, String utfoertKassasjon, String sletting, String skjerming, String gradering, String elektroniskSignatur, String dokumentobjekt) {
        this.systemID = systemID;
        this.dokumentType = dokumentType;
        this.dokumentStatus = dokumentStatus;
        this.tittel = tittel;
        this.beskrivelse = beskrivelse;
        this.forfatter = forfatter;
        this.opprettetDato = opprettetDato;
        this.opprettetAv = opprettetAv;
        this.dokumentMedium = dokumentMedium;
        this.oppbevaringssted = oppbevaringssted;
        this.referanseArkivedel = referanseArkivedel;
        this.tilknyttetRegistreringSom = tilknyttetRegistreringSom;
        this.dokumentNummer = dokumentNummer;
        this.tilknyttetDato = tilknyttetDato;
        this.tilknyttetAv = tilknyttetAv;
        this.merknad = merknad;
        this.kassasjon = kassasjon;
        this.utfoertKassasjon = utfoertKassasjon;
        this.sletting = sletting;
        this.skjerming = skjerming;
        this.gradering = gradering;
        this.elektroniskSignatur = elektroniskSignatur;
        //this.dokumentobjekt = dokumentobjekt;
    }

    public Long getDokumentBeskrivelseId() {
        return dokumentBeskrivelseId;
    }

    public void setDokumentBeskrivelseId(Long dokumentBeskrivelseId) {
        this.dokumentBeskrivelseId = dokumentBeskrivelseId;
    }

    public String getSystemID() {
        return systemID;
    }

    public void setSystemID(String systemID) {
        this.systemID = systemID;
    }

    public String getDokumentType() {
        return dokumentType;
    }

    public void setDokumentType(String dokumentType) {
        this.dokumentType = dokumentType;
    }

    public String getDokumentStatus() {
        return dokumentStatus;
    }

    public void setDokumentStatus(String dokumentStatus) {
        this.dokumentStatus = dokumentStatus;
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

    public String getDokumentMedium() {
        return dokumentMedium;
    }

    public void setDokumentMedium(String dokumentMedium) {
        this.dokumentMedium = dokumentMedium;
    }

    public String getOppbevaringssted() {
        return oppbevaringssted;
    }

    public void setOppbevaringssted(String oppbevaringssted) {
        this.oppbevaringssted = oppbevaringssted;
    }

    public String getReferanseArkivedel() {
        return referanseArkivedel;
    }

    public void setReferanseArkivedel(String referanseArkivedel) {
        this.referanseArkivedel = referanseArkivedel;
    }

    public String getTilknyttetRegistreringSom() {
        return tilknyttetRegistreringSom;
    }

    public void setTilknyttetRegistreringSom(String tilknyttetRegistreringSom) {
        this.tilknyttetRegistreringSom = tilknyttetRegistreringSom;
    }

    public Long getDokumentNummer() {
        return dokumentNummer;
    }

    public void setDokumentNummer(Long dokumentNummer) {
        this.dokumentNummer = dokumentNummer;
    }

    public Date getTilknyttetDato() {
        return tilknyttetDato;
    }

    public void setTilknyttetDato(Date tilknyttetDato) {
        this.tilknyttetDato = tilknyttetDato;
    }

    public String getTilknyttetAv() {
        return tilknyttetAv;
    }

    public void setTilknyttetAv(String tilknyttetAv) {
        this.tilknyttetAv = tilknyttetAv;
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

    public String getUtfoertKassasjon() {
        return utfoertKassasjon;
    }

    public void setUtfoertKassasjon(String utfoertKassasjon) {
        this.utfoertKassasjon = utfoertKassasjon;
    }

    public String getSletting() {
        return sletting;
    }

    public void setSletting(String sletting) {
        this.sletting = sletting;
    }

    public String getSkjerming() {
        return skjerming;
    }

    public void setSkjerming(String skjerming) {
        this.skjerming = skjerming;
    }

    public String getGradering() {
        return gradering;
    }

    public void setGradering(String gradering) {
        this.gradering = gradering;
    }

    public String getElektroniskSignatur() {
        return elektroniskSignatur;
    }

    public void setElektroniskSignatur(String elektroniskSignatur) {
        this.elektroniskSignatur = elektroniskSignatur;
    }

    /*public String getDokumentobjekt() {
        return dokumentobjekt;
    }*/

   /* public void setDokumentobjekt(String dokumentobjekt) {
        this.dokumentobjekt = dokumentobjekt;
    }*/
}