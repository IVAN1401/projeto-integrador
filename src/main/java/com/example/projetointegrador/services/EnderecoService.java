package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Endereco;
import com.example.projetointegrador.models.Taxa;

import java.util.List;

public interface EnderecoService {
    List<Endereco> listar();

    Endereco editar (Endereco endereco);

    Endereco salvar (Endereco endereco) throws Exception;

    void deletar (Long id_endereco);
}
