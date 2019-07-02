package com.dc19einnsyn.einnsynv2.packages.Journalpost;

import com.dc19einnsyn.einnsynv2.packages.Registrering.Registrering;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data //lager getters,setters,toString og noen til.
@NoArgsConstructor
public class Journalpost extends Registrering {

    //Forenklet
    //NOTHING?

    //Full
    private String journalaar;
    private String journalsekvensnummer;
    private String journalpostnummer;
    private String journalposttype;
    private String journalstatus;
    private String journaldato;
    private String dokumentetsDato;
    private String mottattDato;
    private String sendtDato;
    private String forfallsdato;
    private String offentlighetsvurdertDato;
    private String antallVedlegg;
    private String utlaantDato;
    private String utlaantTil;
    private String journalenhet;
    private String avskrivning;
    private String dokumentflyt;
    private String presedens;
    private String elektroniskSignatur;
    private String foelgsakenreferanse;

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