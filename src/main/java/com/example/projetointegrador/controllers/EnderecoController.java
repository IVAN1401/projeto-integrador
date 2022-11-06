package com.example.projetointegrador.controllers;

import com.example.projetointegrador.models.Endereco;
import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.services.EnderecoServiceImpl;
import com.example.projetointegrador.services.PessoaServiceImpl;
import com.example.projetointegrador.services.TaxaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EnderecoController {
    @RestController
    @RequestMapping(value = "/api")
    @CrossOrigin
    public class EnderecoController {

        final EnderecoServiceImpl enderecoServiceImpl;

        public EnderecoController(EnderecoServiceImpl enderecoService) {
            EnderecoServiceImpl ;
            this.enderecoServiceImpl= TaxaServiceImpl;
        }
        @PostMapping(value= "/salvarEndereco")
        public ResponseEntity<Object> salvarEndereco(@RequestBody Endereco endereco) {
            Endereco response = EnderecoServiceImpl.salvar();
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }
        @GetMapping(value = "/buscarEndereco")
        public ResponseEntity<Object> buscarEndereco(@RequestBody Endereco endereco) {
            List<Pessoa> response = TaxaServiceImpl.listar();
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }
        @PutMapping(value = "/alterarTaxa")
        public ResponseEntity<Object> alterarPessoa (@RequestBody Pessoa pessoa){
            Pessoa response = TaxaServiceImpl.editar(Pessoa);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }
    }
}
