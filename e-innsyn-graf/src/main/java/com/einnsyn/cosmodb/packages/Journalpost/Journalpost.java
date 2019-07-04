package com.einnsyn.cosmodb.packages.Journalpost;

import com.dc19einnsyn.einnsynv2.packages.Dokumentbeskrivelse.Dokumentbeskrivelse;
import com.dc19einnsyn.einnsynv2.packages.Korrespondansepart.Korrespondansepart;
import com.dc19einnsyn.einnsynv2.packages.Mappe.Mappe;
import com.dc19einnsyn.einnsynv2.packages.Registrering.Registrering;
import com.dc19einnsyn.einnsynv2.packages.Skjerming.Skjerming;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;
import java.util.Set;

@Entity
@NoArgsConstructor
public class Journalpost extends Registrering {


    private Integer journalaar;
    private Long journalsekvensnummer;
    private Integer journalpostnummer;
    private String journalposttype;
    private String journalstatus;
    private Date journaldato;
    private Date dokumentetsDato;
    private Date mottattDato;
    private Date sendtDato;
    private Date forfallsdato;
    private Date offentlighetsvurdertDato;
    private Integer antallVedlegg;
    private Date utlaantDato;
    private String utlaantTil;
    private String journalenhet;
    private String avskrivning;
    private String dokumentflyt;
    private String presedens;
    private String elektroniskSignatur;
    private String foelgsakenreferanse;

    public Journalpost(Mappe mappe, Skjerming skjerming, Set<Dokumentbeskrivelse> dokumentbeskrivelser, Set<Korrespondansepart> korrespondanseparter, Long registreringsID, String systemID, String opprettetDato, String opprettetAv, String arkivertDato, String arkivertAv, String referanseArkivdel, String kassasjon, String gradering, String dokumentbeskrivelse, String dokumentobjekt, String korrespondansepart, String tittel, String offentligTittel, String beskrivelse, String noekkelord, String forfatter, String dokumentmedium, String oppbevaringssted, String virksomhetsspesifikkeMetadata, String merknad, String kryssreferanse, Integer journalaar, Long journalsekvensnummer, Integer journalpostnummer, String journalposttype, String journalstatus, Date journaldato, Date dokumentetsDato, Date mottattDato, Date sendtDato, Date forfallsdato, Date offentlighetsvurdertDato, Integer antallVedlegg, Date utlaantDato, String utlaantTil, String journalenhet, String avskrivning, String dokumentflyt, String presedens, String elektroniskSignatur, String foelgsakenreferanse) {
        super(mappe, skjerming, dokumentbeskrivelser, korrespondanseparter, registreringsID, systemID, opprettetDato, opprettetAv, arkivertDato, arkivertAv, referanseArkivdel, kassasjon, gradering, dokumentbeskrivelse, dokumentobjekt, korrespondansepart, tittel, offentligTittel, beskrivelse, noekkelord, forfatter, dokumentmedium, oppbevaringssted, virksomhetsspesifikkeMetadata, merknad, kryssreferanse);
        this.journalaar = journalaar;
        this.journalsekvensnummer = journalsekvensnummer;
        this.journalpostnummer = journalpostnummer;
        this.journalposttype = journalposttype;
        this.journalstatus = journalstatus;
        this.journaldato = journaldato;
        this.dokumentetsDato = dokumentetsDato;
        this.mottattDato = mottattDato;
        this.sendtDato = sendtDato;
        this.forfallsdato = forfallsdato;
        this.offentlighetsvurdertDato = offentlighetsvurdertDato;
        this.antallVedlegg = antallVedlegg;
        this.utlaantDato = utlaantDato;
        this.utlaantTil = utlaantTil;
        this.journalenhet = journalenhet;
        this.avskrivning = avskrivning;
        this.dokumentflyt = dokumentflyt;
        this.presedens = presedens;
        this.elektroniskSignatur = elektroniskSignatur;
        this.foelgsakenreferanse = foelgsakenreferanse;
    }

    public Integer getJournalaar() {
        return journalaar;
    }

    public void setJournalaar(Integer journalaar) {
        this.journalaar = journalaar;
    }

    public Long getJournalsekvensnummer() {
        return journalsekvensnummer;
    }

    public void setJournalsekvensnummer(Long journalsekvensnummer) {
        this.journalsekvensnummer = journalsekvensnummer;
    }

    public Integer getJournalpostnummer() {
        return journalpostnummer;
    }

    public void setJournalpostnummer(Integer journalpostnummer) {
        this.journalpostnummer = journalpostnummer;
    }

    public String getJournalposttype() {
        return journalposttype;
    }

    public void setJournalposttype(String journalposttype) {
        this.journalposttype = journalposttype;
    }

    public String getJournalstatus() {
        return journalstatus;
    }

    public void setJournalstatus(String journalstatus) {
        this.journalstatus = journalstatus;
    }

    public Date getJournaldato() {
        return journaldato;
    }

    public void setJournaldato(Date journaldato) {
        this.journaldato = journaldato;
    }

    public Date getDokumentetsDato() {
        return dokumentetsDato;
    }

    public void setDokumentetsDato(Date dokumentetsDato) {
        this.dokumentetsDato = dokumentetsDato;
    }

    public Date getMottattDato() {
        return mottattDato;
    }

    public void setMottattDato(Date mottattDato) {
        this.mottattDato = mottattDato;
    }

    public Date getSendtDato() {
        return sendtDato;
    }

    public void setSendtDato(Date sendtDato) {
        this.sendtDato = sendtDato;
    }

    public Date getForfallsdato() {
        return forfallsdato;
    }

    public void setForfallsdato(Date forfallsdato) {
        this.forfallsdato = forfallsdato;
    }

    public Date getOffentlighetsvurdertDato() {
        return offentlighetsvurdertDato;
    }

    public void setOffentlighetsvurdertDato(Date offentlighetsvurdertDato) {
        this.offentlighetsvurdertDato = offentlighetsvurdertDato;
    }

    public Integer getAntallVedlegg() {
        return antallVedlegg;
    }

    public void setAntallVedlegg(Integer antallVedlegg) {
        this.antallVedlegg = antallVedlegg;
    }

    public Date getUtlaantDato() {
        return utlaantDato;
    }

    public void setUtlaantDato(Date utlaantDato) {
        this.utlaantDato = utlaantDato;
    }

    public String getUtlaantTil() {
        return utlaantTil;
    }

    public void setUtlaantTil(String utlaantTil) {
        this.utlaantTil = utlaantTil;
    }

    public String getJournalenhet() {
        return journalenhet;
    }

    public void setJournalenhet(String journalenhet) {
        this.journalenhet = journalenhet;
    }

    public String getAvskrivning() {
        return avskrivning;
    }

    public void setAvskrivning(String avskrivning) {
        this.avskrivning = avskrivning;
    }

    public String getDokumentflyt() {
        return dokumentflyt;
    }

    public void setDokumentflyt(String dokumentflyt) {
        this.dokumentflyt = dokumentflyt;
    }

    public String getPresedens() {
        return presedens;
    }

    public void setPresedens(String presedens) {
        this.presedens = presedens;
    }

    public String getElektroniskSignatur() {
        return elektroniskSignatur;
    }

    public void setElektroniskSignatur(String elektroniskSignatur) {
        this.elektroniskSignatur = elektroniskSignatur;
    }

    public String getFoelgsakenreferanse() {
        return foelgsakenreferanse;
    }

    public void setFoelgsakenreferanse(String foelgsakenreferanse) {
        this.foelgsakenreferanse = foelgsakenreferanse;
    }
}
/*
*<xs:element name="journalaar" type="n5mdk:journalaar" minOccurs="0"/>
                    <xs:element name="journalsekvensnummer" type="n5mdk:journalsekvensnummer" minOccurs="0"/>
                    <xs:element name="journalpostnummer" type="n5mdk:journalpostnummer" minOccurs="0"/>
                    <xs:element name="journalposttype" type="n5mdk:journalposttype"/>
                    <xs:element name="journalstatus" type="n5mdk:journalstatus"/>
                    <xs:element name="journaldato" type="n5mdk:journaldato"/>
                    <xs:element name="dokumentetsDato" type="n5mdk:dokumentetsDato" minOccurs="0"/>
                    <xs:element name="mottattDato" type="n5mdk:mottattDato" minOccurs="0"/>
                    <xs:element name="sendtDato" type="n5mdk:sendtDato" minOccurs="0"/>
                    <xs:element name="forfallsdato" type="n5mdk:forfallsdato" minOccurs="0"/>
                    <xs:element name="offentlighetsvurdertDato" type="n5mdk:offentlighetsvurdertDato" minOccurs="0"/>
                    <xs:element name="antallVedlegg" type="n5mdk:antallVedlegg" minOccurs="0"/>
                    <xs:element name="utlaantDato" type="n5mdk:utlaantDato" minOccurs="0"/>
                    <xs:element name="utlaantTil" type="n5mdk:utlaantTil" minOccurs="0"/>
                    <xs:element name="journalenhet" type="n5mdk:journalenhet" minOccurs="0"/>
                    <!-- Lar vi korrespondansepart stå etter sammenslåing av basisregistrering og registrering (for bakoverkompatibilitet)? -->
                    <xs:element name="korrespondansepart" type="korrespondansepart" minOccurs="0" maxOccurs="unbounded"/>
                    <xs:element name="avskrivning" type="avskrivning" minOccurs="0" maxOccurs="unbounded"/>
                    <xs:element name="dokumentflyt" type="dokumentflyt" minOccurs="0" maxOccurs="unbounded"/>
                    <xs:element name="presedens" type="presedens" minOccurs="0" maxOccurs="unbounded"/>
                    <xs:element name="elektroniskSignatur" type="elektroniskSignatur" minOccurs="0"/>
                    <xs:element name="foelgsakenreferanse" type="n5mdk:referanseTilRegistrering" minOccurs="0" maxOccurs="unbounded"/>
* */