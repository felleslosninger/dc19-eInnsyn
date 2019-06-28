package com.dc19einnsyn.einnsynv2.packages;

import lombok.*;

import javax.persistence.Entity;

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