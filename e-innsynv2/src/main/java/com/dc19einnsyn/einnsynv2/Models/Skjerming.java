package com.dc19einnsyn.einnsynv2.Models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@ToString
@NoArgsConstructor
public class Skjerming {

    public Skjerming (
            String tilgangsrestriksjon, String skjermingshjemmel,
            String skjermingMetadata, String skjermingDokument,
            String skjermingsvarighet, String skjermingOpphoererData) {
        this.tilgangsrestriksjon = tilgangsrestriksjon;
        this.skjermingshjemmel = skjermingshjemmel;
        this.skjermingMetadata = skjermingMetadata;
        this.skjermingDokument = skjermingDokument;
        this.skjermingsvarighet = skjermingsvarighet;
        this.skjermingOpphoererData = skjermingOpphoererData;
    }

        @Id
        @GeneratedValue
        private long skjermingId;

        private String tilgangsrestriksjon;
        private String skjermingshjemmel;
        private String skjermingMetadata;
        private String skjermingDokument;
        private String skjermingsvarighet;
        private String skjermingOpphoererData;

    /*
    <xs:element name="tilgangsrestriksjon" type="n5mdk:tilgangsrestriksjon"/>
    <xs:element name="skjermingshjemmel" type="n5mdk:skjermingshjemmel"/>
    <xs:element name="skjermingMetadata" type="n5mdk:skjermingMetadata" maxOccurs="unbounded"/>
    <xs:element name="skjermingDokument" type="n5mdk:skjermingDokument" minOccurs="0"/>
    <xs:element name="skjermingsvarighet" type="n5mdk:skjermingsvarighet" minOccurs="0"/>
    <xs:element name="skjermingOpphoererDato" type="n5mdk:skjermingOpphoererDato" minOccurs="0"/>
     */

}
