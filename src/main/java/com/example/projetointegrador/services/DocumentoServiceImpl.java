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
            for (Documento cpf1 : listaDeDocumento) {
                if (documento.getCpf().equals(cpf1.getCpf())) {
                    throw new Exception("Esse CPF já esta cadastrado!");
                }for (Documento identidade : listaDeDocumento) {
                    if (documento.getIdentidade().equals(identidade.getIdentidade())) {
                        throw new Exception("Identidade já esta cadastrado!");
                    }
                }
            }
            return documentoRepository.save(documento);
        }
        @Override
        public void deletar(Long id_documento) {
            documentoRepository.deleteById(id_documento);
        }
    }