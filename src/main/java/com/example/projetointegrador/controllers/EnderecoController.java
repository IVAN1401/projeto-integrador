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

    @RestController
    @RequestMapping(value = "/api")
    @CrossOrigin
    public class EnderecoController {

        final EnderecoServiceImpl enderecoServiceImpl;

        public EnderecoController(EnderecoServiceImpl enderecoService) {
            this.enderecoServiceImpl = enderecoService;
        }

        @PostMapping(value = "/salvarEndereco")
        public ResponseEntity<Object> salvarEndereco(@RequestBody Endereco endereco) throws Exception {
            Endereco response = enderecoServiceImpl.salvar(endereco);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }

        @GetMapping(value = "/buscarEndereco")
        public ResponseEntity<Object> buscarEndereco(@RequestBody Endereco endereco) {
            List<Endereco> response = enderecoServiceImpl.listar();
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }

        @PutMapping(value = "/alterarEndereco")
        public ResponseEntity<Object> alterarPessoa(@RequestBody Endereco endereco) {
            Endereco response = enderecoServiceImpl.editar(endereco);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }

        @DeleteMapping(value = "/deletarEndereco")
        public ResponseEntity<Object> deletarEndereco(Long id_endereco) {
            enderecoServiceImpl.deletar(id_endereco);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
    }