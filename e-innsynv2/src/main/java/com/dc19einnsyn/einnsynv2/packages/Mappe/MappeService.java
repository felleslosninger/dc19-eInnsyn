package com.dc19einnsyn.einnsynv2.packages.Mappe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MappeService {


    @Autowired
    private MappeRepository mappeRepository;


    public List<Mappe> getAllMapper(){
        List<Mappe> mapper = new ArrayList<>();
        mappeRepository.findAll().forEach(mapper::add);
        return mapper;
    }


    public Optional<Mappe> getMappe(Long id){
        return mappeRepository.findById(id);
    }


    public Mappe addMappe(Mappe mappe){
        mappeRepository.save(mappe);
        return mappe;
    }


    public Mappe updateMappe(Mappe mappe, Long id){
        mappe.setMappeID(id);
        mappeRepository.save(mappe);
        return mappe;
    }


    public void deleteMappe(Long id){
        mappeRepository.deleteById(id);
    }


}
