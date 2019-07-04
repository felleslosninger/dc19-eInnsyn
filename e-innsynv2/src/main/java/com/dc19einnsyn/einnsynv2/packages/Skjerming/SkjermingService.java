package com.dc19einnsyn.einnsynv2.packages.Skjerming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SkjermingService {


    @Autowired
    private SkjermingRepository skjermingRepository;
    
    
    public List<Skjerming> getAllSkjerminger(){
        List<Skjerming> dokumentbeskrivelser = new ArrayList<>();
        skjermingRepository.findAll().forEach(dokumentbeskrivelser::add);
        return dokumentbeskrivelser;
    }


    public Optional<Skjerming> getSkjerming(Long id){
        return skjermingRepository.findById(id);
    }


    public Skjerming addSkjerming(Skjerming dokumentbeskrivelse){
        skjermingRepository.save(dokumentbeskrivelse);
        return dokumentbeskrivelse;
    }


    public Skjerming updateSkjerming(Skjerming dokumentbeskrivelse, Long id){
        dokumentbeskrivelse.setSkjermingId(id);
        skjermingRepository.save(dokumentbeskrivelse);
        return dokumentbeskrivelse;
    }


    public void deleteSkjerming(Long id){
        skjermingRepository.deleteById(id);
    }


}
