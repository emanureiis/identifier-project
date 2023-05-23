package br.com.emanureiis.identifier.api.controller;

import br.com.emanureiis.identifier.api.dados.UnsettledTitleDTO;
import br.com.emanureiis.identifier.api.model.Credito;
import br.com.emanureiis.identifier.api.service.Identifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/identificador")
public class UnsettledTitleController {

    @PostMapping("/identifier")
    public Credito identifier(UnsettledTitleDTO data, MultipartFile pdf) {
        System.out.println("TESTE OK");
        return null;
    }
}
