package com.dificampeinnsyn.einnsynweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class webController {


    @GetMapping("/read")
    public String readFile(){
        return "read";
    }

}
