package com.einnsyn.cosmodb.packages.Korrespondansepart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class KorrespondansepartController {

    @Autowired
    private KorrespondansepartService korrespondansepartService;

    @GetMapping("/korrespondanseparter")
    public List<Korrespondansepart> getAllKorrespondanseparter(){
        return korrespondansepartService.getAllKorrespondanseparter();
    }

    @GetMapping("/korrespondanseparter/{id}")
    public Optional<Korrespondansepart> getKorrespondansepart(@PathVariable Long id){
        return korrespondansepartService.getKorrespondansepart(id);
    }

    @PostMapping("/korrespondanseparter")
    public Korrespondansepart addKorrespondansepart(@RequestBody Korrespondansepart korrespondansepart){
        return korrespondansepartService.addKorrespondansepart(korrespondansepart);
    }

    @PutMapping("/korrespondanseparter/{id}")
    public Korrespondansepart updateKorrespondansepart(@RequestBody Korrespondansepart korrespondansepart, @PathVariable Long id){
        korrespondansepartService.updateKorrespondansepart(korrespondansepart, id);
        return korrespondansepart;
    }


    @DeleteMapping("/korrespondanseparter/{id}")
    public void deleteJournalpost(@PathVariable Long id){
        korrespondansepartService.deleteKorrespondansepart(id);
    }

    
    
}
