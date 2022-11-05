package com.example.projetointegrador.repositories;

import com.example.projetointegrador.models.Documento;
import com.example.projetointegrador.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoRepository extends JpaRepository<Documento,Long> {

}
