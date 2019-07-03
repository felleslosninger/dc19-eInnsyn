package com.dc19einnsyn.einnsynv2.packages.Registrering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RegistreringService {



    @Autowired
    private RegistreringRepository registreringRepository;


    public List<Registrering> getAllRegistreringer(){
        List<Registrering> registreringer = new ArrayList<>();
        registreringRepository.findAll().forEach(registreringer::add);
        return registreringer;
    }


    public Optional<Registrering> getRegistrering(Long id){
        return registreringRepository.findById(id);
    }


    public Registrering addRegistrering(Registrering registrering){
        registreringRepository.save(registrering);
        return registrering;
    }


    public Registrering updateRegistrering(Registrering registrering, Long id){
        registrering.setRegistreringsID(id);
        registreringRepository.save(registrering);
        return registrering;
    }


    public void deleteRegistrering(Long id){
        registreringRepository.deleteById(id);
    }



}
