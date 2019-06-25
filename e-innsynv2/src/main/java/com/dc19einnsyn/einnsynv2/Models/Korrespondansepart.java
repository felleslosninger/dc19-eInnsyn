package com.dc19einnsyn.einnsynv2.Models;

import lombok.Data;

import javax.persistence.Entity;
@Entity
@Data

public class Korrespondansepart {

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
}
