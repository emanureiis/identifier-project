package br.com.emanureiis.identifier.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }
}
