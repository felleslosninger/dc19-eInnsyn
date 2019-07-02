package com.dc19einnsyn.einnsynv2.packages.Journalpost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JournalpostService {


    @Autowired
    private JournalpostRepository journalpostRepository;


    public List<Journalpost> getAllJournalposter(){
        List<Journalpost> journalposter = new ArrayList<>();
        journalpostRepository.findAll().forEach(journalposter::add);
        return journalposter;
    }


    public Optional<Journalpost> getJournalpost(Long id){
        return journalpostRepository.findById(id);
    }


    public Journalpost addJournalpost(Journalpost journalpost){
        journalpostRepository.save(journalpost);
        return journalpost;
    }


    public Journalpost updateJournalpost(Journalpost journalpost, Long id){
        journalpost.setJournalpostId(id);
        journalpostRepository.save(journalpost);
        return journalpost;
    }


    public void deleteJournalpost(Long id){
        journalpostRepository.deleteById(id);
    }

}
