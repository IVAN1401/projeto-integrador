package com.example.projetointegrador.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Pessoa {
    private String nome;
    private Documento documentos;
    private Endereco endereco;
    private String genero;
    private Integer idade;
    private Double rendimentoMensal;
    private String estadoCivil;
    private String dependentes;
    private Carteira carteira;

}
