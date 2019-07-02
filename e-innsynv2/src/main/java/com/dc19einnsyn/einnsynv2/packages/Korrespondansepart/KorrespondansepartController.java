package com.dc19einnsyn.einnsynv2.packages.Korrespondansepart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class KorrespondansepartController {

    @Autowired
    private KorrespondansepartService korrespondansepartService;

    @GetMapping("/Korrespondanseparter")
    public List<Korrespondansepart> getAllKorrespondanseparter(){
        return korrespondansepartService.getAllKorrespondanseparter();
    }

    @GetMapping("/Korrespondanseparter/{id}")
    public Optional<Korrespondansepart> getKorrespondansepart(@PathVariable Long id){
        return korrespondansepartService.getKorrespondansepart(id);
    }

    @PostMapping("/Korrespondanseparter")
    public Korrespondansepart addKorrespondansepart(@RequestBody Korrespondansepart korrespondansepart){
        return korrespondansepartService.addKorrespondansepart(korrespondansepart);
    }

    @PutMapping("/Korrespondanseparter/{id}")
    public Korrespondansepart updateKorrespondansepart(@RequestBody Korrespondansepart korrespondansepart, @PathVariable Long id){
        korrespondansepartService.updateKorrespondansepart(korrespondansepart, id);
        return korrespondansepart;
    }


    @DeleteMapping("/Korrespondanseparter/{id}")
    public void deleteJournalpost(@PathVariable Long id){
        korrespondansepartService.deleteKorrespondansepart(id);
    }

    
    
}
