package com.cadastro.sistema.repository;

import com.cadastro.sistema.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Integer> {
}
