package com.cadastro.sistema.service;

import com.cadastro.sistema.model.Produto;

public interface ProdutoService {
    Produto buscarProduto();
    Produto buscarTodos();
    Produto salvar(Produto produto);
}
