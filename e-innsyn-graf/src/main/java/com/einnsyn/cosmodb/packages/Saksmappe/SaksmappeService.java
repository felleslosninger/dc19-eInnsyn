package com.einnsyn.cosmodb.packages.Saksmappe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SaksmappeService {
    
    
    @Autowired
    private SaksmappeRepository saksmappeRepository;


    public List<Saksmappe> getAllSaksmapper(){
        List<Saksmappe> Saksmapper = new ArrayList<>();
        saksmappeRepository.findAll().forEach(Saksmapper::add);
        return Saksmapper;
    }


    public Optional<Saksmappe> getSaksmappe(Long id){
        return saksmappeRepository.findById(id);
    }


    public Saksmappe addSaksmappe(Saksmappe Saksmappe){
        saksmappeRepository.save(Saksmappe);
        return Saksmappe;
    }


    public Saksmappe updateSaksmappe(Saksmappe Saksmappe, Long id){
        Saksmappe.setMappeID(id);
        saksmappeRepository.save(Saksmappe);
        return Saksmappe;
    }


    public void deleteSaksmappe(Long id){
        saksmappeRepository.deleteById(id);
    }



}
