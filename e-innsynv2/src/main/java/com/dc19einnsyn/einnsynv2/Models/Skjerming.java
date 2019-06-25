package com.dc19einnsyn.einnsynv2.Models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Skjerming {
    private String tilgangsrestriksjon;
    private String skjermingshjemmel;
    private String skjermingMetadata;
    private String skjermingDokument;
    private String skjjermingsvarighet;
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
