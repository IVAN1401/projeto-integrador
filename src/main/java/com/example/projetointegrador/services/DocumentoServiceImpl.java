package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Documento;
import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.repositories.DocumentoRepository;
import com.example.projetointegrador.repositories.PessoaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

        @Service
    public class DocumentoServiceImpl<documento> implements DocumentoService {

        final DocumentoRepository documentoRepository;

        public DocumentoServiceImpl(DocumentoRepository documentoRepository) {
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
        public Documento salvar(Documento documento) throws Exception {
            List<Documento> listaDeDocumento = documentoRepository.findAll();
            for (Documento documento1 : listaDeDocumento) {
                if (documento.getNome().equals(documento1.getNome())) {
                    throw new Exception("Esse nome já esta cadastrado!");
                }
            }
            return documentoRepository.save(documento);
        }
        @Override
        public void deletar(Long id_documento) {
            documentoRepository.deleteById(id_documento);
        }
    }