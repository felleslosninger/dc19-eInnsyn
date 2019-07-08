package com.dc19einnsyn.einnsynv2.packages.Saksmappe;

import com.dc19einnsyn.einnsynv2.packages.Mappe.Mappe;
import com.dc19einnsyn.einnsynv2.packages.Registrering.Registrering;
import lombok.*;
import org.hibernate.exception.DataException;

import javax.persistence.Entity;
import java.util.Date;
import java.util.Set;

@Entity
@NoArgsConstructor
public class Saksmappe extends Mappe {

    private Integer saksaar;
    private Long sakssekvensnummer;
    private DataException saksdato;
    private String administrativEnhet;
    private String saksansvarlig;
    private String journalenhet;
    private String saksstatus;
    private Date utlaantDato;
    private String utlaantTil;
    private String referanseSekundaerKassifikasjon;
    private String sakspart;
    private String presidens;

    public Saksmappe(Set<Registrering> registrering, String systemID, String tittel, String offentligTittel, String beskrivelse, String noekkelord, String dokumentmedium, String oppbevaringssted, String opprettetDato, String opprettetAv, String avsluttetDato, String avsluttetAv, String referanseArkivdel, String virksomhetsspesifikkeMetadata, String kryssreferanse, String merknad, String kassasjon, String gradering, String skjerming, String mappe, String saksmappe, String journalpost, Integer saksaar, Long sakssekvensnummer, DataException saksdato, String administrativEnhet, String saksansvarlig, String journalenhet, String saksstatus, Date utlaantDato, String utlaantTil, String referanseSekundaerKassifikasjon, String sakspart, String presidens) {
        super(registrering, systemID, tittel, offentligTittel, beskrivelse, noekkelord, dokumentmedium, oppbevaringssted, opprettetDato, opprettetAv, avsluttetDato, avsluttetAv, referanseArkivdel, virksomhetsspesifikkeMetadata, kryssreferanse, merknad, kassasjon, gradering, skjerming, mappe, saksmappe, journalpost);
        this.saksaar = saksaar;
        this.sakssekvensnummer = sakssekvensnummer;
        this.saksdato = saksdato;
        this.administrativEnhet = administrativEnhet;
        this.saksansvarlig = saksansvarlig;
        this.journalenhet = journalenhet;
        this.saksstatus = saksstatus;
        this.utlaantDato = utlaantDato;
        this.utlaantTil = utlaantTil;
        this.referanseSekundaerKassifikasjon = referanseSekundaerKassifikasjon;
        this.sakspart = sakspart;
        this.presidens = presidens;
    }

    public Integer getSaksaar() {
        return saksaar;
    }


    public void setSaksaar(Integer saksaar) {
        this.saksaar = saksaar;
    }


    public Long getSakssekvensnummer() {
        return sakssekvensnummer;
    }


    public void setSakssekvensnummer(Long sakssekvensnummer) {
        this.sakssekvensnummer = sakssekvensnummer;
    }


    public DataException getSaksdato() {
        return saksdato;
    }


    public void setSaksdato(DataException saksdato) {
        this.saksdato = saksdato;
    }


    public String getAdministrativEnhet() {
        return administrativEnhet;
    }


    public void setAdministrativEnhet(String administrativEnhet) {
        this.administrativEnhet = administrativEnhet;
    }


    public String getSaksansvarlig() {
        return saksansvarlig;
    }


    public void setSaksansvarlig(String saksansvarlig) {
        this.saksansvarlig = saksansvarlig;
    }


    public String getJournalenhet() {
        return journalenhet;
    }


    public void setJournalenhet(String journalenhet) {
        this.journalenhet = journalenhet;
    }


    public String getSaksstatus() {
        return saksstatus;
    }


    public void setSaksstatus(String saksstatus) {
        this.saksstatus = saksstatus;
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


    public String getReferanseSekundaerKassifikasjon() {
        return referanseSekundaerKassifikasjon;
    }


    public void setReferanseSekundaerKassifikasjon(String referanseSekundaerKassifikasjon) {
        this.referanseSekundaerKassifikasjon = referanseSekundaerKassifikasjon;
    }


    public String getSakspart() {
        return sakspart;
    }


    public void setSakspart(String sakspart) {
        this.sakspart = sakspart;
    }


    public String getPresidens() {
        return presidens;
    }


    public void setPresidens(String presidens) {
        this.presidens = presidens;
    }


}
