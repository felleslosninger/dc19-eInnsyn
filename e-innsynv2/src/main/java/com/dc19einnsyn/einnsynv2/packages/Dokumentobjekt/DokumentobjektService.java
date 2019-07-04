package com.dc19einnsyn.einnsynv2.packages.Dokumentobjekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DokumentobjektService {

    @Autowired
    private DokumentobjektRepository dokumentobjektRepository;


    public List<Dokumentobjekt> getAllDokumentobjekter(){
        List<Dokumentobjekt> Dokumentobjekt = new ArrayList<>();
        dokumentobjektRepository.findAll().forEach(Dokumentobjekt::add);
        return Dokumentobjekt;
    }


    public Optional<Dokumentobjekt> getDokumentobjekt(Long id){
        return dokumentobjektRepository.findById(id);
    }


    public Dokumentobjekt addDokumentobjekt(Dokumentobjekt Dokumentobjekt){
        dokumentobjektRepository.save(Dokumentobjekt);
        return Dokumentobjekt;
    }


    public Dokumentobjekt updateDokumentobjekt(Dokumentobjekt Dokumentobjekt, Long id){
        Dokumentobjekt.setDokumentObjektId(id);
        dokumentobjektRepository.save(Dokumentobjekt);
        return Dokumentobjekt;
    }


    public void deleteDokumentobjekt(Long id){
        dokumentobjektRepository.deleteById(id);
    }

}
