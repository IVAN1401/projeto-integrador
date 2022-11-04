package com.example.projetointegrador.controllers;

import com.example.projetointegrador.models.Carteira;
import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.services.CarteiraService;
import com.example.projetointegrador.services.PessoaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class CarteiraController {

    final CarteiraServiceImpl carteiraService;

    public CarteiraController(PessoaServiceImpl pessoaService) {
        this.CarteiraServiceImpl= CarteiraService;
    }
    @PostMapping(value= "/salvarCarteira")
    public ResponseEntity<Object> salvarPessoa(@RequestBody Pessoa pessoa) {
        Pessoa response = CarteiraServiceImpl.salvar();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @GetMapping(value = "/buscarCarteira")
    public ResponseEntity<Object> buscarPessoa(@RequestBody Pessoa pessoa) {
        List<Pessoa> response = CarteiraServiceImpl.listar();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @PutMapping(value = "/alterarCarteira")
    public ResponseEntity<Object> alterarPessoa (@RequestBody Pessoa pessoa){
        Pessoa response = CarteiraServiceImpl.editar(Pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}