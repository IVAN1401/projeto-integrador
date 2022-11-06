package com.example.projetointegrador.controllers;

import com.example.projetointegrador.models.Carteira;
import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.services.CarteiraServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class CarteiraController {

    final CarteiraServiceImpl carteiraServiceImpl;

    public CarteiraController(CarteiraServiceImpl carteiraService) {
        this.carteiraServiceImpl = carteiraService;
    }


    @PostMapping(value= "/salvarCarteira")
    public ResponseEntity<Object> salvarPessoa(@RequestBody Carteira carteira) {
        Carteira response = carteiraServiceImpl.salvar(carteira);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @GetMapping(value = "/buscarCarteira")
    public ResponseEntity<Object> buscarCarteira(@RequestBody Carteira carteira) {
        List<Carteira> response = carteiraServiceImpl.listar(carteira);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @PutMapping(value = "/alterarCarteira")
    public ResponseEntity<Object> alterarcarteira (@RequestBody Carteira carteira){
        Carteira response = carteiraServiceImpl.editar(carteira);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}