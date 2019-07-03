package com.dc19einnsyn.einnsynv2.packages.Dokumentobjekt;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DokumentobjektController {

    private DokumentobjektService dokumentobjektService;

    @GetMapping("/dokumentobjekter")
    public List<Dokumentobjekt> getAllDokumentobjekter(){
        return dokumentobjektService.getAllDokumentobjekter();
    }

    @GetMapping("/dokumentobjekter/{id}")
    public Optional<Dokumentobjekt> getDokumentobjekt(@PathVariable Long id){
        return dokumentobjektService.getDokumentobjekt(id);
    }

    @PostMapping("/dokumentobjekter")
    public Dokumentobjekt addDokumentobjekt(@RequestBody Dokumentobjekt dokumentobjekt){
        return dokumentobjektService.addDokumentobjekt(dokumentobjekt);
    }

    @PutMapping("/dokumentobjekter/{id}")
    public Dokumentobjekt updateDokumentobjekt(@RequestBody Dokumentobjekt dokumentobjekt, @PathVariable Long id){
        dokumentobjektService.updateDokumentobjekt(dokumentobjekt, id);
        return dokumentobjekt;
    }


    @DeleteMapping("/dokumentobjekter/{id}")
    public void deleteDokumentobjekt(@PathVariable Long id){
        dokumentobjektService.deleteDokumentobjekt(id);
    }



}
