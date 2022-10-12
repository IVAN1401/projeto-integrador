package com.example.projetointegrador.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.DocFlavor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Endereco {
    private String logadouro;
    private String numerocasa;
    private String referencia;
}
