package com.dc19einnsyn.einnsynv2.packages.Journalpost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JournalpostController {

    @Autowired
    private JournalpostService journalpostService;

    @GetMapping("/Journalposter")
    public List<Journalpost> getAllJournalposter(){
        return journalpostService.getAllJournalposter();
    }

    @GetMapping("/Journalposter/{id}")
    public Optional<Journalpost> getJournalpost(@PathVariable Long id){
        return journalpostService.getJournalpost(id);
    }

    @PostMapping("/Journalposter")
    public Journalpost addJournalpost(@RequestBody Journalpost dokumentbeskrivelse){
        return journalpostService.addJournalpost(dokumentbeskrivelse);
    }

    @PutMapping("/Journalposter/{id}")
    public Journalpost updateJournalpost(@RequestBody Journalpost dokumentbeskrivelse, @PathVariable Long id){
        journalpostService.updateJournalpost(dokumentbeskrivelse, id);
        return dokumentbeskrivelse;
    }


    @DeleteMapping("/dokumentbeskrivelser/{id}")
    public void deleteJournalpost(@PathVariable Long id){
        journalpostService.deleteJournalpost(id);
    }


}
