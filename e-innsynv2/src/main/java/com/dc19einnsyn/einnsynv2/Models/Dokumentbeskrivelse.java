package com.dc19einnsyn.einnsynv2.Models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Dokumentbeskrivelse {

    @Id
    @GeneratedValue
    private long dokumentBeskrivelseId;

    private String systemID;
    private String dokumenttype;
    private String dokumentstatus;
    private String tittel;
    private String beskrivelse;
    private String forfatter;
    private String oprettetDato;
    private String oprettetAv;
    private String dokumentmeduim;
    private String oppbevaringssted;
    private String referanseArkivdel;
    private String tilknyttetRegistreringSom;
    private String dokumentnummer;
    private String tilknyttetDato;
    private String tilknyttetAv;
    private String merknad;
    private String kassasjon;
    private String utforetKassasjon;
    private String sletting;
    private String skjerming;
    private String gradering;
    private String elektroniskSignatur;

    //Set<Dokumentobjekt> dokumentobjekter;
}

/*
            <xs:element name="systemID" type="n5mdk:systemID"/>
            <xs:element name="dokumenttype" type="n5mdk:dokumenttype"/>
            <xs:element name="dokumentstatus" type="n5mdk:dokumentstatus"/>
            <xs:element name="tittel" type="tittel"/>
            <xs:element name="beskrivelse" type="n5mdk:beskrivelse" minOccurs="0"/>
            <xs:element name="forfatter" type="forfatter" minOccurs="0" maxOccurs="unbounded"/>
            <xs:element name="opprettetDato" type="n5mdk:opprettetDato"/>
            <xs:element name="opprettetAv" type="n5mdk:opprettetAv"/>
            <xs:element name="dokumentmedium" type="n5mdk:dokumentmedium" minOccurs="0"/>
            <xs:element name="oppbevaringssted" type="n5mdk:oppbevaringssted" minOccurs="0"/>
            <xs:element name="referanseArkivdel" type="n5mdk:referanseArkivdel" minOccurs="0" maxOccurs="unbounded"/>
            <xs:element name="tilknyttetRegistreringSom" type="n5mdk:tilknyttetRegistreringSom"/>
            <xs:element name="dokumentnummer" type="n5mdk:dokumentnummer"/>
            <xs:element name="tilknyttetDato" type="n5mdk:tilknyttetDato"/>
            <xs:element name="tilknyttetAv" type="n5mdk:tilknyttetAv"/>

            <xs:element name="merknad" type="merknad" minOccurs="0" maxOccurs="unbounded"/>
            <xs:element name="kassasjon" type="kassasjon" minOccurs="0"/>
            <xs:element name="utfoertKassasjon" type="utfoertKassasjon" minOccurs="0"/>
            <xs:element name="sletting" type="sletting" minOccurs="0"/>
            <xs:element name="skjerming" type="skjerming" minOccurs="0"/>
            <xs:element name="gradering" type="gradering" minOccurs="0"/>
            <xs:element name="elektroniskSignatur" type="elektroniskSignatur" minOccurs="0"/>
            <xs:element name="dokumentobjekt" type="dokumentobjekt" minOccurs="0" maxOccurs="unbounded"/>
 */