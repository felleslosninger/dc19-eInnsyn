package com.dc19einnsyn.einnsynv2.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "tbl_person")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Saksmappe extends Mappe{
    private String saksaar;
    private String sakssekvensnummer;
    private String saksdato;
    private String adminstrativEnhet;
    private String saksansvarlig;
    private String journalenhet;
    private String saksstatus;
    private String utlaantDato;
    private String utlaantTil;
    private String regeranseSekundaerKassifikasjon;
    private String sakspart;
    private String presidens;




}