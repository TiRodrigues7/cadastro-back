package com.cadastro.sistema.service.impl;

import com.cadastro.sistema.entity.ProdutoEntity;
import com.cadastro.sistema.model.Produto;
import com.cadastro.sistema.repository.ProdutoRepository;
import com.cadastro.sistema.service.ProdutoService;
import org.springframework.stereotype.Service;

@Service
public class ProutoServiceImpl implements ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public Produto buscarProduto(){
        Produto produto = new Produto();
        produto.setCodigo(001);
        produto.setDescricao("Ex: Notebook Lenovo");
        produto.setValor(2500.99);
        return produto;
    }

    @Override
    public Produto buscarTodos(){
        return null;
    }

    @Override
    public Produto salvar(Produto produto) {

        ProdutoEntity produtoEntity = new ProdutoEntity();
        produtoEntity.setDescricao(produto.getDescricao());
        produtoEntity.setValor(produto.getValor());
        ProdutoEntity retorno = this.produtoRepository.save(produtoEntity);

        Produto produtoRetorno = new Produto();
        produtoRetorno.setCodigo(retorno.getCodigo());
        produtoRetorno.setDescricao(retorno.getDescricao());
        produtoRetorno.setValor(retorno.getValor());
        return produtoRetorno;

    }
}
