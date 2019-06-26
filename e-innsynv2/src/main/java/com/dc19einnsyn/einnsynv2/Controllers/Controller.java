package com.dc19einnsyn.einnsynv2.Controllers;

import com.dc19einnsyn.einnsynv2.Models.Skjerming;
import com.dc19einnsyn.einnsynv2.Repositories.DokumentobjektRepository;
import com.dc19einnsyn.einnsynv2.Repositories.SkjermingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController // @Controller and @ResponseBody rolled together.
public class Controller {
    @Autowired
    SkjermingRepository skjermingRepository;
    //DokumentobjektRepository dokumentobjektRepository;

    @GetMapping(path = "/skjerming")
    @ResponseBody
    public Set<Skjerming> helloYou(@PathVariable("skjermingDokument") String skjermingDokument) {
        return skjermingRepository.findBySkjermingDokument(skjermingDokument);
    }


  /*  @GetMapping("/yo")
    public String yo(){
        return "yo";
    }*/
}
