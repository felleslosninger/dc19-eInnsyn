package com.einnsyn.cosmodb.packages.Registrering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RegistreringController {


    @Autowired
    private RegistreringService registreringService;


    @GetMapping("/registreringer")
    public List<Registrering> getAllRegistreringer(){
        return registreringService.getAllRegistreringer();
    }


    @GetMapping("/registreringer/{id}")
    public Optional<Registrering> getRegistreringer(@PathVariable Long id){
        return registreringService.getRegistrering(id);
    }


    @PostMapping("/registreringer")
    public Registrering addRegistreringer(@RequestBody Registrering registrering){
        return registreringService.addRegistrering(registrering);
    }


    @PutMapping("/registreringer/{id}")
    public Registrering updateRegistreringer(@RequestBody Registrering registrering, @PathVariable Long id){
        registreringService.updateRegistrering(registrering, id);
        return registrering;
    }


    @DeleteMapping("/registreringer/{id}")
    public void deleteRegistreringer(@PathVariable Long id){
        registreringService.deleteRegistrering(id);
    }


}
