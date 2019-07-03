package com.dc19einnsyn.einnsynv2.packages.Registrering;

import com.dc19einnsyn.einnsynv2.packages.Dokumentbeskrivelse.Dokumentbeskrivelse;
import com.dc19einnsyn.einnsynv2.packages.Korrespondansepart.Korrespondansepart;
import com.dc19einnsyn.einnsynv2.packages.Mappe.Mappe;
import com.dc19einnsyn.einnsynv2.packages.Skjerming.Skjerming;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table
public class Registrering {

    @ManyToOne
    @JoinColumn(name = "mappe_id")
    private Mappe mappe;

    @OneToOne(mappedBy = "registrering",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false
    )
    private Skjerming skjerming;

    @OneToMany(
            mappedBy = "registrering",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Dokumentbeskrivelse> dokumentbeskrivelser;

    @OneToMany(
            mappedBy = "registrering",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Korrespondansepart> korrespondanseparter;

    @Id
    private Long registreringsID;
    private String systemID;
    private String opprettetDato;
    private String opprettetAv;
    private String arkivertDato;
    private String arkivertAv;
    private String referanseArkivdel;

    private String kassasjon;
    //private String skjerming;
    private String gradering;

    private String dokumentbeskrivelse;
    private String dokumentobjekt;

    private String korrespondansepart;


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

    public Registrering(Long registreringsID, String systemID, String opprettetDato, String opprettetAv, String arkivertDato, String arkivertAv, String referanseArkivdel, String kassasjon, String skjerming, String gradering, String dokumentbeskrivelse, String dokumentobjekt, String korrespondansepart, String tittel, String offentligTittel, String beskrivelse, String noekkelord, String forfatter, String dokumentmedium, String oppbevaringssted, String virksomhetsspesifikkeMetadata, String merknad, String kryssreferanse) {
        this.registreringsID = registreringsID;
        this.systemID = systemID;
        this.opprettetDato = opprettetDato;
        this.opprettetAv = opprettetAv;
        this.arkivertDato = arkivertDato;
        this.arkivertAv = arkivertAv;
        this.referanseArkivdel = referanseArkivdel;
        this.kassasjon = kassasjon;
        //this.skjerming = skjerming;
        this.gradering = gradering;
        this.dokumentbeskrivelse = dokumentbeskrivelse;
        this.dokumentobjekt = dokumentobjekt;
        this.korrespondansepart = korrespondansepart;
        this.tittel = tittel;
        this.offentligTittel = offentligTittel;
        this.beskrivelse = beskrivelse;
        this.noekkelord = noekkelord;
        this.forfatter = forfatter;
        this.dokumentmedium = dokumentmedium;
        this.oppbevaringssted = oppbevaringssted;
        this.virksomhetsspesifikkeMetadata = virksomhetsspesifikkeMetadata;
        this.merknad = merknad;
        this.kryssreferanse = kryssreferanse;
    }

    public Long getRegistreringsID() {
        return registreringsID;
    }

    public void setRegistreringsID(Long registreringsID) {
        this.registreringsID = registreringsID;
    }

    public String getSystemID() {
        return systemID;
    }

    public void setSystemID(String systemID) {
        this.systemID = systemID;
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

    public String getArkivertDato() {
        return arkivertDato;
    }

    public void setArkivertDato(String arkivertDato) {
        this.arkivertDato = arkivertDato;
    }

    public String getArkivertAv() {
        return arkivertAv;
    }

    public void setArkivertAv(String arkivertAv) {
        this.arkivertAv = arkivertAv;
    }

    public String getReferanseArkivdel() {
        return referanseArkivdel;
    }

    public void setReferanseArkivdel(String referanseArkivdel) {
        this.referanseArkivdel = referanseArkivdel;
    }

    public String getKassasjon() {
        return kassasjon;
    }

    public void setKassasjon(String kassasjon) {
        this.kassasjon = kassasjon;
    }

    /*public String getSkjerming() {
        return skjerming;
    }

    public void setSkjerming(String skjerming) {
        this.skjerming = skjerming;
    }
*/
    public String getGradering() {
        return gradering;
    }

    public void setGradering(String gradering) {
        this.gradering = gradering;
    }

    public String getDokumentbeskrivelse() {
        return dokumentbeskrivelse;
    }

    public void setDokumentbeskrivelse(String dokumentbeskrivelse) {
        this.dokumentbeskrivelse = dokumentbeskrivelse;
    }

    public String getDokumentobjekt() {
        return dokumentobjekt;
    }

    public void setDokumentobjekt(String dokumentobjekt) {
        this.dokumentobjekt = dokumentobjekt;
    }

    public String getKorrespondansepart() {
        return korrespondansepart;
    }

    public void setKorrespondansepart(String korrespondansepart) {
        this.korrespondansepart = korrespondansepart;
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

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
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

    public String getVirksomhetsspesifikkeMetadata() {
        return virksomhetsspesifikkeMetadata;
    }

    public void setVirksomhetsspesifikkeMetadata(String virksomhetsspesifikkeMetadata) {
        this.virksomhetsspesifikkeMetadata = virksomhetsspesifikkeMetadata;
    }

    public String getMerknad() {
        return merknad;
    }

    public void setMerknad(String merknad) {
        this.merknad = merknad;
    }

    public String getKryssreferanse() {
        return kryssreferanse;
    }

    public void setKryssreferanse(String kryssreferanse) {
        this.kryssreferanse = kryssreferanse;
    }

// Set<Korrespondansepart> korrespondanseparter;
    //Set<Dokumentbeskrivelse> dokumentbeskrivelser;
    //Set<Skjerming> skjerminger;
}
