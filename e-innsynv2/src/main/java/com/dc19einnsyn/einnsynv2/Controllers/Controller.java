package com.dc19einnsyn.einnsynv2.Controllers;

import com.dc19einnsyn.einnsynv2.Models.Skjerming;
import com.dc19einnsyn.einnsynv2.Repositories.DokumentobjektRepository;
import com.dc19einnsyn.einnsynv2.Repositories.SkjermingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController // @Controller and @ResponseBody rolled together.
public class Controller {
    @Autowired
    SkjermingRepository skjermingRepository;
    //DokumentobjektRepository dokumentobjektRepository;

    @GetMapping(path = "/skjerming/{skjermingDokument}")
    @ResponseBody
    public Set<Skjerming> dokumentfil(@PathVariable("skjermingDokument") String skjermingDokument) {
        return skjermingRepository.findBySkjermingDokument(skjermingDokument);
    }


  /*  @GetMapping("/yo")
    public String yo(){
        return "yo";
    }*/
}
