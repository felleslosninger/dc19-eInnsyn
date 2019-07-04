package com.einnsyn.cosmodb.packages.Korrespondansepart;

import com.dc19einnsyn.einnsynv2.packages.Registrering.Registrering;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Korrespondansepart {

    @ManyToOne
    @JoinColumn(name = "registrerings_id")
    private Registrering registrering;

    @Id
    @GeneratedValue
    private long korrespondansePartId;

    private String korrespondanseparttype;
    private String korrespondansepartNavn;
    private String postadresse;
    private String postnummer;
    private String poststed;
    private String land;
    private String epostadresse;
    private String telefonnummer;
    private String kontaktparson;
    private String administrativEnhet;
    private String saksbehandler;
    private String korrespondansepartEnhetstype;
    private String organisasjonsnummer;

    public Korrespondansepart(Registrering registrering, String korrespondanseparttype, String korrespondansepartNavn, String postadresse, String postnummer, String poststed, String land, String epostadresse, String telefonnummer, String kontaktparson, String administrativEnhet, String saksbehandler, String korrespondansepartEnhetstype, String organisasjonsnummer) {
        this.registrering = registrering;
        this.korrespondanseparttype = korrespondanseparttype;
        this.korrespondansepartNavn = korrespondansepartNavn;
        this.postadresse = postadresse;
        this.postnummer = postnummer;
        this.poststed = poststed;
        this.land = land;
        this.epostadresse = epostadresse;
        this.telefonnummer = telefonnummer;
        this.kontaktparson = kontaktparson;
        this.administrativEnhet = administrativEnhet;
        this.saksbehandler = saksbehandler;
        this.korrespondansepartEnhetstype = korrespondansepartEnhetstype;
        this.organisasjonsnummer = organisasjonsnummer;
    }

    public Registrering getRegistrering() {
        return registrering;
    }

    public void setRegistrering(Registrering registrering) {
        this.registrering = registrering;
    }

    public long getKorrespondansePartId() {
        return korrespondansePartId;
    }

    public void setKorrespondansePartId(long korrespondansePartId) {
        this.korrespondansePartId = korrespondansePartId;
    }

    public String getKorrespondanseparttype() {
        return korrespondanseparttype;
    }

    public void setKorrespondanseparttype(String korrespondanseparttype) {
        this.korrespondanseparttype = korrespondanseparttype;
    }

    public String getKorrespondansepartNavn() {
        return korrespondansepartNavn;
    }

    public void setKorrespondansepartNavn(String korrespondansepartNavn) {
        this.korrespondansepartNavn = korrespondansepartNavn;
    }

    public String getPostadresse() {
        return postadresse;
    }

    public void setPostadresse(String postadresse) {
        this.postadresse = postadresse;
    }

    public String getPostnummer() {
        return postnummer;
    }

    public void setPostnummer(String postnummer) {
        this.postnummer = postnummer;
    }

    public String getPoststed() {
        return poststed;
    }

    public void setPoststed(String poststed) {
        this.poststed = poststed;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getEpostadresse() {
        return epostadresse;
    }

    public void setEpostadresse(String epostadresse) {
        this.epostadresse = epostadresse;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getKontaktparson() {
        return kontaktparson;
    }

    public void setKontaktparson(String kontaktparson) {
        this.kontaktparson = kontaktparson;
    }

    public String getAdministrativEnhet() {
        return administrativEnhet;
    }

    public void setAdministrativEnhet(String administrativEnhet) {
        this.administrativEnhet = administrativEnhet;
    }

    public String getSaksbehandler() {
        return saksbehandler;
    }

    public void setSaksbehandler(String saksbehandler) {
        this.saksbehandler = saksbehandler;
    }

    public String getKorrespondansepartEnhetstype() {
        return korrespondansepartEnhetstype;
    }

    public void setKorrespondansepartEnhetstype(String korrespondansepartEnhetstype) {
        this.korrespondansepartEnhetstype = korrespondansepartEnhetstype;
    }

    public String getOrganisasjonsnummer() {
        return organisasjonsnummer;
    }

    public void setOrganisasjonsnummer(String organisasjonsnummer) {
        this.organisasjonsnummer = organisasjonsnummer;
    }
}
