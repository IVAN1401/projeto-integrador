package com.example.projetointegrador.repositories;

import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.models.Taxa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxaRepository extends JpaRepository<Taxa,Long> {

}
