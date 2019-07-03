package com.dc19einnsyn.einnsynv2.packages.Mappe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MappeController {


    @Autowired
    private MappeService mappeService;


    @GetMapping("/mapper")
    public List<Mappe> getAllMapper(){
        return mappeService.getAllMapper();
    }


    @GetMapping("/mapper/{id}")
    public Optional<Mappe> getMappe(@PathVariable Long id){
        return mappeService.getMappe(id);
    }


    @PostMapping("/mapper")
    public Mappe addMappe(@RequestBody Mappe Mappe){
        return mappeService.addMappe(Mappe);
    }


    @PutMapping("/mapper/{id}")
    public Mappe updateMappe(@RequestBody Mappe Mappe, @PathVariable Long id){
        mappeService.updateMappe(Mappe, id);
        return Mappe;
    }


    @DeleteMapping("/mapper/{id}")
    public void deleteMappe(@PathVariable Long id){
        mappeService.deleteMappe(id);
    }


}
