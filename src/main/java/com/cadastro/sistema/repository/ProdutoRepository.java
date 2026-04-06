package com.cadastro.sistema.repository;

import com.cadastro.sistema.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Integer> {
}
