package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Carteira;
import com.example.projetointegrador.models.Pessoa;

import java.util.List;

public interface CarteiraService {
        List<Carteira> listar();

        Carteira editar (Carteira carteira);

        Carteira salvar (Carteira carteira) throws Exception;

        void deletar (Long id_carteira);
}