package com.dc19einnsyn.einnsynv2.packages.Saksmappe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SaksmappeController {


    @Autowired
    private SaksmappeService saksmappeService;


    @GetMapping("/saksmapper")
    public List<Saksmappe> getAllSaksmapper(){
        return saksmappeService.getAllSaksmapper();
    }


    @GetMapping("/saksmapper/{id}")
    public Optional<Saksmappe> getSaksmappe(@PathVariable Long id){
        return saksmappeService.getSaksmappe(id);
    }


    @PostMapping("/saksmapper")
    public Saksmappe addSaksmappe(@RequestBody Saksmappe Saksmappe){
        return saksmappeService.addSaksmappe(Saksmappe);
    }


    @PutMapping("/saksmapper/{id}")
    public Saksmappe updateSaksmappe(@RequestBody Saksmappe Saksmappe, @PathVariable Long id){
        saksmappeService.updateSaksmappe(Saksmappe, id);
        return Saksmappe;
    }


    @DeleteMapping("/saksmapper/{id}")
    public void deleteSaksmappe(@PathVariable Long id){
        saksmappeService.deleteSaksmappe(id);
    }


}
