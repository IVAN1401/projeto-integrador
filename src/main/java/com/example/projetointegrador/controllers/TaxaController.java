package com.example.projetointegrador.controllers;

import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.models.Taxa;
import com.example.projetointegrador.services.PessoaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class TaxaController {

    final TaxaServiceImpl taxaService;

    public CarteiraController(PessoaServiceImpl pessoaService) {
        this.TaxaServiceImpl= taxaService;
    }
    @PostMapping(value= "/salvarCarteira")
    public ResponseEntity<Object> salvarPessoa(@RequestBody Pessoa pessoa) {
        Pessoa response = TaxaServiceImpl.salvar();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @GetMapping(value = "/buscarTaxa")
    public ResponseEntity<Object> buscarPessoa(@RequestBody Pessoa pessoa) {
        List<Pessoa> response = TaxaServiceImpl.listar();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @PutMapping(value = "/alterarTaxa")
    public ResponseEntity<Object> alterarPessoa (@RequestBody Pessoa pessoa){
        Pessoa response = TaxaServiceImpl.editar(Pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
