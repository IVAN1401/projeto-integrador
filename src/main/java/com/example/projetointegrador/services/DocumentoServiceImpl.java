package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Documento;
import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.repositories.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public class DocumentoServiceImpl {
    public static List<Documento> listar() {
    }

    @Service
    public class DocumentoServiceImpl implements DocumentoService {

        final documentoRepository documentoRepository;

        public DocumentoServiceImpl(documentoRepository documentoRepository) {
            this.documentoRepository = documentoRepository;
        }

        @Override
        public List<Documento> listar() {
            return documentoRepository.findAll();
        }

        @Override
        public Documento editar(Documento documento) {

            return documentoRepository.save(documento);
        }

        @Override
        public Documento salvar(Documento documento) {
            return documentoRepository.save(documento);
        }

        @Override
        public void deletar (Long id_documento){
            documentoRepository.deleteById(id_documento);
        }
    }
