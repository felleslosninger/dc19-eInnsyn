package com.dc19einnsyn.einnsynv2.Models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Dokumentobjekt {

    @Id
    @GeneratedValue
    private int dokumentObjektId;

    private String versjonsnummer;
    private String variantformat;
    private String format;
    private String formatDetaljer;
    private String oprettetDato;
    private String opprettetAv;
    private String referanseDokumentfil;
    private String sjekksum;
    private String sjekksumAlgoritme;
    private String filstoerrelse;
    private String elektroniskSignatur;
    private String konvertering;
}

/*
<xs:sequence>
    <xs:element name="versjonsnummer" type="n5mdk:versjonsnummer"/>
    <xs:element name="variantformat" type="n5mdk:variantformat"/>
    <xs:element name="format" type="n5mdk:format"/>
    <xs:element name="formatDetaljer" type="n5mdk:formatDetaljer" minOccurs="0"/>
    <xs:element name="opprettetDato" type="n5mdk:opprettetDato"/>
    <xs:element name="opprettetAv" type="n5mdk:opprettetAv"/>
    <xs:element name="referanseDokumentfil" type="n5mdk:referanseDokumentfil"/>
    <xs:element name="sjekksum" type="n5mdk:sjekksum"/>
    <xs:element name="sjekksumAlgoritme" type="n5mdk:sjekksumAlgoritme"/>
    <xs:element name="filstoerrelse" type="n5mdk:filstoerrelse"/>
    <xs:element name="elektroniskSignatur" type="elektroniskSignatur" minOccurs="0"/>

    <xs:element name="konvertering" type="konvertering" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
 */