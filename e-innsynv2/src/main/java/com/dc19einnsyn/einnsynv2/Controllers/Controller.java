package com.dc19einnsyn.einnsynv2.Controllers;

import com.dc19einnsyn.einnsynv2.Repositories.DokumentobjektRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller and @ResponseBody rolled together.
public class Controller {

    DokumentobjektRepository dokumentobjektRepository;

  /*  @GetMapping("/yo")
    public String yo(){
        return "yo";
    }*/
}
