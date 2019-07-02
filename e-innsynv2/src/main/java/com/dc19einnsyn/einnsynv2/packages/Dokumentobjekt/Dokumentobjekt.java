package com.dc19einnsyn.einnsynv2.packages.Dokumentobjekt;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Dokumentobjekt {

    @Id
    @GeneratedValue
    private Long dokumentObjektId;

    private Long versjonsnummer;
    private String variantformat;
    private String format;
    private String formatDetaljer;
    private Date oprettetDato;
    private String opprettetAv;
    private String referanseDokumentfil;
    private String sjekksum;
    private String sjekksumAlgoritme;
    private String filstoerrelse;
    private String elektroniskSignatur;
    private String konvertering;

    public Dokumentobjekt(Long versjonsnummer, String variantformat, String format, String formatDetaljer, Date oprettetDato, String opprettetAv, String referanseDokumentfil, String sjekksum, String sjekksumAlgoritme, String filstoerrelse, String elektroniskSignatur, String konvertering) {
        this.versjonsnummer = versjonsnummer;
        this.variantformat = variantformat;
        this.format = format;
        this.formatDetaljer = formatDetaljer;
        this.oprettetDato = oprettetDato;
        this.opprettetAv = opprettetAv;
        this.referanseDokumentfil = referanseDokumentfil;
        this.sjekksum = sjekksum;
        this.sjekksumAlgoritme = sjekksumAlgoritme;
        this.filstoerrelse = filstoerrelse;
        this.elektroniskSignatur = elektroniskSignatur;
        this.konvertering = konvertering;
    }

    public Long getDokumentObjektId() {
        return dokumentObjektId;
    }

    public void setDokumentObjektId(Long dokumentObjektId) {
        this.dokumentObjektId = dokumentObjektId;
    }

    public Long getVersjonsnummer() {
        return versjonsnummer;
    }

    public void setVersjonsnummer(Long versjonsnummer) {
        this.versjonsnummer = versjonsnummer;
    }

    public String getVariantformat() {
        return variantformat;
    }

    public void setVariantformat(String variantformat) {
        this.variantformat = variantformat;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormatDetaljer() {
        return formatDetaljer;
    }

    public void setFormatDetaljer(String formatDetaljer) {
        this.formatDetaljer = formatDetaljer;
    }

    public Date getOprettetDato() {
        return oprettetDato;
    }

    public void setOprettetDato(Date oprettetDato) {
        this.oprettetDato = oprettetDato;
    }

    public String getOpprettetAv() {
        return opprettetAv;
    }

    public void setOpprettetAv(String opprettetAv) {
        this.opprettetAv = opprettetAv;
    }

    public String getReferanseDokumentfil() {
        return referanseDokumentfil;
    }

    public void setReferanseDokumentfil(String referanseDokumentfil) {
        this.referanseDokumentfil = referanseDokumentfil;
    }

    public String getSjekksum() {
        return sjekksum;
    }

    public void setSjekksum(String sjekksum) {
        this.sjekksum = sjekksum;
    }

    public String getSjekksumAlgoritme() {
        return sjekksumAlgoritme;
    }

    public void setSjekksumAlgoritme(String sjekksumAlgoritme) {
        this.sjekksumAlgoritme = sjekksumAlgoritme;
    }

    public String getFilstoerrelse() {
        return filstoerrelse;
    }

    public void setFilstoerrelse(String filstoerrelse) {
        this.filstoerrelse = filstoerrelse;
    }

    public String getElektroniskSignatur() {
        return elektroniskSignatur;
    }

    public void setElektroniskSignatur(String elektroniskSignatur) {
        this.elektroniskSignatur = elektroniskSignatur;
    }

    public String getKonvertering() {
        return konvertering;
    }

    public void setKonvertering(String konvertering) {
        this.konvertering = konvertering;
    }
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