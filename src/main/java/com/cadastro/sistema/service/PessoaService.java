package com.cadastro.sistema.service;

import com.cadastro.sistema.model.Pessoa;

public interface PessoaService {

    Pessoa buscarPessoa();

    Pessoa burcarTodos();

    Pessoa salvar(Pessoa pessoa);


}
