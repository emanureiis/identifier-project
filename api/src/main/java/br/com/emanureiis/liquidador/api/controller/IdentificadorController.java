package br.com.emanureiis.liquidador.api.controller;

import br.com.emanureiis.liquidador.api.dados.DadosRecebeJson;
import br.com.emanureiis.liquidador.api.model.Credito;
import br.com.emanureiis.liquidador.api.model.ListaDeCreditos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/identificador")
public class IdentificadorController {

    @Autowired
    private Credito credito;

    @Autowired
    private ListaDeCreditos listaCreditosTeste;

    @PostMapping("/dados")
    public void receberDados(DadosRecebeJson dadosJson, MultipartFile arquivo) {


        System.out.println("TESTE OK");
    }


    @GetMapping("/creditos")
    @ResponseBody
    public ResponseEntity<List<Credito>> retornarCreditos() {
        listaCreditosTeste.lista.clear();
        listaCreditosTeste.lista.add(credito);
        return ResponseEntity.ok(listaCreditosTeste.lista);
    }
}
