package com.example.projetointegrador.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "carteira")
@Column
public class Carteira<strategy> {
    @Id
    @GeneratedValue = (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id;
    @Column(name = "name")
    private String nome;
    @Column(name = "saldoAtual")
    private Double saldoAtual;
    @Column(name = "dataInicioInvestimento")
    private Date dataInicioInvestimento;
    @Column(name = "dataTerminoInvestimento")
    private Date dataTerminoInvestimento;

}