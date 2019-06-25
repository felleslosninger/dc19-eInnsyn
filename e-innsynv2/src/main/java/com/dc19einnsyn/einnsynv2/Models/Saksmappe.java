package com.dc19einnsyn.einnsynv2.Models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Saksmappe extends Mappe{
    private String saksaar;
    private String sakssekvensnummer;
    private String saksdato;
    private String administrativEnhet;
    private String saksansvarlig;
    private String journalenhet;
    private String saksstatus;
    private String utlaantDato;
    private String utlaantTil;
    private String referanseSekundaerKassifikasjon;
    private String sakspart;
    private String presidens;




}