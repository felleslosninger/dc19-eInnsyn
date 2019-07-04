package com.einnsyn.cosmodb.packages.Dokumentbeskrivelse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DokumentbeskrivelseController {

    @Autowired
    private DokumentbeskrivelseService dokumentbeskrivelseService;

    @GetMapping("/dokumentbeskrivelser")
    public List<Dokumentbeskrivelse> getAllDokumentBeskrivelser(){
        return dokumentbeskrivelseService.getAllDokumentbeskrivelser();
    }

    @GetMapping("/dokumentbeskrivelser/{id}")
    public Optional<Dokumentbeskrivelse> getDokumentbeskrivelse(@PathVariable Long id){
        return dokumentbeskrivelseService.getDokumentbeskrivelse(id);
    }

    @PostMapping("/dokumentbeskrivelser")
    public Dokumentbeskrivelse addDokumentbeskrivelse(@RequestBody Dokumentbeskrivelse dokumentbeskrivelse){
        return dokumentbeskrivelseService.addDokumentbeskrivelse(dokumentbeskrivelse);
    }

    @PutMapping("/dokumentbeskrivelser/{id}")
    public Dokumentbeskrivelse updateDokumentbeskrivelse(@RequestBody Dokumentbeskrivelse dokumentbeskrivelse, @PathVariable Long id){
        dokumentbeskrivelseService.updateDokumentbeskrivelse(dokumentbeskrivelse, id);
        return dokumentbeskrivelse;
    }


    @DeleteMapping("/dokumentbeskrivelser/{id}")
    public void deleteDokumentbeskrivelse(@PathVariable Long id){
        dokumentbeskrivelseService.deleteDokumentbeskrivelse(id);
    }



}
