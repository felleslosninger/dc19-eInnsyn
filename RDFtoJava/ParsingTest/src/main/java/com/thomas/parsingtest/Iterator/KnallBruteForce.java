package com.thomas.parsingtest.Iterator;

import com.thomas.parsingtest.Models.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class KnallBruteForce {
    BufferedReader bufReader = new BufferedReader(new StringReader("C:\\Users\\camp-tvy\\Documents\\ProsjektTest\\Data\\kortfil.ttl"));
    String line = null;

    public static void read() throws IOException {
        BufferedReader bufReader = new BufferedReader(new StringReader("C:\\Users\\camp-tvy\\Documents\\ProsjektTest\\Data\\kortfil.ttl"));
        String line = null;

        while ((line = bufReader.readLine()) != null){
            if (line.contains("Journalpost")){
                Journalpost jp = new Journalpost();

                while (!(line = bufReader.readLine()).contains("Journalpost") ||
                        !(line = bufReader.readLine()).contains("Registrering")
                ){

                }
                if (line.contains("journalaar")){
                    jp.setJournalaar(line.intern());//???????????
                }
                else if (line.contains("journalsekvensnummer")){
                    jp.setJournalsekvensnummer(line.intern());//???????????
                }
                else if (line.contains("journalpostnummer")){
                    jp.setJournalpostnummer(line.intern());//???????????
                }
                else if (line.contains("journalposttype")){
                    jp.setJournalposttype(line.intern());//???????????
                }
                else if (line.contains("journalstatus")){
                    jp.setJournalstatus(line.intern());//???????????
                }
                else if (line.contains("journaldato")){
                    jp.setJournaldato(line.intern());//???????????
                }
                else if (line.contains("dokumentetsDato")){
                    jp.setDokumentetsDato(line.intern());//???????????
                }
                else if (line.contains("mottattDato")){
                    jp.setMottattDato(line.intern());//???????????
                }
                else if (line.contains("sendtDato")){
                    jp.setSendtDato(line.intern());//???????????
                }
                else if (line.contains("forfallsdato")){
                    jp.setForfallsdato(line.intern());//???????????
                }
                else if (line.contains("offentlighetsvurdertDato")){
                    jp.setOffentlighetsvurdertDato(line.intern());//???????????
                }
                else if (line.contains("antallVedlegg")){
                    jp.setAntallVedlegg(line.intern());//???????????
                }
                else if (line.contains("utlaantDato")){
                    jp.setUtlaantDato(line.intern());//???????????
                }
                else if (line.contains("utlaantTil")){
                    jp.setUtlaantTil(line.intern());//???????????
                }
                else if (line.contains("journalenhet")){
                    jp.setJournalenhet(line.intern());//???????????
                }
                else if (line.contains("avskrivning")){
                    jp.setAvskrivning(line.intern());//???????????
                }
                else if (line.contains("dokumentflyt")){
                    jp.setDokumentflyt(line.intern());//???????????
                }
                else if (line.contains("presedens")){
                    jp.setPresedens(line.intern());//???????????
                }
                else if (line.contains("elektroniskSignatur")){
                    jp.setElektroniskSignatur(line.intern());//???????????
                }
                else if (line.contains("foelgsakenreferanse")){
                    jp.setFoelgsakenreferanse(line.intern());//???????????
                }

            }
        }
    }
}
