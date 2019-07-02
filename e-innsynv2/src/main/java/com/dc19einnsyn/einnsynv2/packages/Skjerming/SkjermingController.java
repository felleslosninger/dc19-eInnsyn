package com.dc19einnsyn.einnsynv2.packages.Skjerming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SkjermingController {

    @Autowired
    private SkjermingService skjermingService;

    @GetMapping("/skjerminger")
    public List<Skjerming> getAllSkjerminger(){
        return skjermingService.getAllSkjerminger();
    }

    @GetMapping("/skjerminger/{id}")
    public Optional<Skjerming> getSkjerming(@PathVariable Long id){
        return skjermingService.getSkjerming(id);
    }

    @PostMapping("/skjerminger")
    public Skjerming addSkjerming(@RequestBody Skjerming dokumentbeskrivelse){
        return skjermingService.addSkjerming(dokumentbeskrivelse);
    }

    @PutMapping("/skjerminger/{id}")
    public Skjerming updateSkjerming(@RequestBody Skjerming dokumentbeskrivelse, @PathVariable Long id){
        skjermingService.updateSkjerming(dokumentbeskrivelse, id);
        return dokumentbeskrivelse;
    }


    @DeleteMapping("/skjerminger/{id}")
    public void deleteSkjerming(@PathVariable Long id){
        skjermingService.deleteSkjerming(id);
    }




}
