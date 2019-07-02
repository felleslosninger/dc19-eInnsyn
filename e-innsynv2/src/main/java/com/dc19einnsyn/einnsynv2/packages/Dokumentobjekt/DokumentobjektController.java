package com.dc19einnsyn.einnsynv2.packages.Dokumentobjekt;

import com.dc19einnsyn.einnsynv2.packages.Dokumentbeskrivelse.Dokumentbeskrivelse;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DokumentobjektController {

    private DokumentobjektService dokumentobjektService;

    @GetMapping("/dokumentobjekt")
    public List<Dokumentobjekt> getAllDokumentobjekter(){
        return dokumentobjektService.getAllDokumentobjekter();
    }

    @GetMapping("/dokumentobjekt/{id}")
    public Optional<Dokumentobjekt> getDokumentobjekt(@PathVariable Long id){
        return dokumentobjektService.getDokumentobjekt(id);
    }

    @PostMapping("/dokumentobjekt")
    public Dokumentobjekt addDokumentobjekt(@RequestBody Dokumentobjekt dokumentobjekt){
        return dokumentobjektService.addDokumentobjekt(dokumentobjekt);
    }

    @PutMapping("/dokumentobjekt/{id}")
    public Dokumentobjekt updateDokumentobjekt(@RequestBody Dokumentobjekt dokumentobjekt, @PathVariable Long id){
        dokumentobjektService.updateDokumentobjekt(dokumentobjekt, id);
        return dokumentobjekt;
    }


    @DeleteMapping("/dokumentobjekt/{id}")
    public void deleteDokumentobjekt(@PathVariable Long id){
        dokumentobjektService.deleteDokumentobjekt(id);
    }



}
