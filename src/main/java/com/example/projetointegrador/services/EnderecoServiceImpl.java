package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Endereco;
import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.repositories.EnderecoRepository;
import com.example.projetointegrador.repositories.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public class EnderecoServiceImpl {
    public static Endereco salvar() {
    }

    @Service
    public class EnderecoServiceImpl implements EnderecoService {

        final EnderecoRepository enderecoRepository = null;

        public EnderecoServiceImpl(EnderecoRepository EnderecoRepository) {
            this.enderecoRepository = enderecoRepository;
        }

        @Override
        public List<Endereco> listar() {
            return EnderecoRepository.findAll();
        }

        @Override
        public Endereco editar(Endereco endereco) {

            return enderecoRepository.save(endereco);
        }
