package com.dc19einnsyn.einnsynv2.packages.Dokumentbeskrivelse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DokumentbeskrivelseService {


    @Autowired
        private DokumentbeskrivelseRepository dokumenbeskrivelseRepository;


    public List<Dokumentbeskrivelse> getAllDokumentbeskrivelser(){
        List<Dokumentbeskrivelse> dokumentbeskrivelser = new ArrayList<>();
        dokumenbeskrivelseRepository.findAll().forEach(dokumentbeskrivelser::add);
        return dokumentbeskrivelser;
    }


    public Optional<Dokumentbeskrivelse> getDokumentbeskrivelse(Long id){
        return dokumenbeskrivelseRepository.findById(id);
    }


    public Dokumentbeskrivelse addDokumentbeskrivelse(Dokumentbeskrivelse dokumentbeskrivelse){
        dokumenbeskrivelseRepository.save(dokumentbeskrivelse);
        return dokumentbeskrivelse;
    }


    public Dokumentbeskrivelse updateDokumentbeskrivelse(Dokumentbeskrivelse dokumentbeskrivelse, Long id){
        dokumentbeskrivelse.setDokumentBeskrivelseId(id);
        dokumenbeskrivelseRepository.save(dokumentbeskrivelse);
        return dokumentbeskrivelse;
    }


    public void deleteDokumentbeskrivelse(Long id){
        dokumenbeskrivelseRepository.deleteById(id);
    }

}
