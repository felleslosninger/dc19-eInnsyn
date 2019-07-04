package com.dc19einnsyn.einnsynv2.packages.Korrespondansepart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class KorrespondansepartService {


    @Autowired
    private KorrespondansepartRepository korrespondansepartRepository;


    public List<Korrespondansepart> getAllKorrespondanseparter(){
        List<Korrespondansepart> journalposter = new ArrayList<>();
        korrespondansepartRepository.findAll().forEach(journalposter::add);
        return journalposter;
    }


    public Optional<Korrespondansepart> getKorrespondansepart(Long id){
        return korrespondansepartRepository.findById(id);
    }


    public Korrespondansepart addKorrespondansepart(Korrespondansepart korrespondansepart){
        korrespondansepartRepository.save(korrespondansepart);
        return korrespondansepart;
    }


    public Korrespondansepart updateKorrespondansepart(Korrespondansepart korrespondansepart, Long id){
        korrespondansepart.setKorrespondansePartId(id);
        korrespondansepartRepository.save(korrespondansepart);
        return korrespondansepart;
    }


    public void deleteKorrespondansepart(Long id){
        korrespondansepartRepository.deleteById(id);
    }


}
