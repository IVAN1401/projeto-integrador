package com.example.projetointegrador.controllers;

import com.example.projetointegrador.models.Documento;
import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.services.DocumentoServiceImpl;
import com.example.projetointegrador.services.PessoaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class DocumentoController {

    final DocumentoController documentoService;

    public CarteiraController(DocumentoServiceImpl pessoaService) {
        this.DocumentoServiceImpl= DocumentoService;
    }
    @PostMapping(value= "/salvarDocumento")
    public ResponseEntity<Object> salvarPessoa(@RequestBody Pessoa pessoa) {
        Pessoa response = DocumentoServiceImpl.salvar();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @GetMapping(value = "/buscarDocumento")
    public ResponseEntity<Object> buscarPessoa(@RequestBody Pessoa pessoa) {
        List<Pessoa> response = DocumentoServiceImpl.listar();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @PutMapping(value = "/alterardocumento")
    public ResponseEntity<Object> alterarPessoa (@RequestBody Pessoa pessoa){
        Pessoa response = DocumentoServiceImpl.editar(Pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
