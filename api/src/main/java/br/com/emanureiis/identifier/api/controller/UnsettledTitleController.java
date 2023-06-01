package br.com.emanureiis.identifier.api.controller;

import br.com.emanureiis.identifier.api.data.UnsettledTitleDTO;
import br.com.emanureiis.identifier.api.model.Title;
import br.com.emanureiis.identifier.api.service.IdentifierService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

import static br.com.emanureiis.identifier.api.service.IdentifierService.titles;

@RestController
@RequestMapping("/identificador")
public class UnsettledTitleController {

//    public static List titles;

    @PostMapping("/request")
    public ResponseEntity identifier(UnsettledTitleDTO data, MultipartFile pdf, UriComponentsBuilder uriBuilder) {
        titles = IdentifierService.identify(data, pdf);
        var uri = uriBuilder.path("/identificador/result").buildAndExpand().toUri();
        return ResponseEntity.created(uri).body(titles);
    }

//    @GetMapping("/result")
//    public ResponseEntity<List<Title>> result() {
//
//        return ResponseEntity.ok(titles);
//    }
}
