package com.cadastro.sistema.service.impl;

import com.cadastro.sistema.entity.PessoaEntity;
import com.cadastro.sistema.model.Pessoa;
import com.cadastro.sistema.repository.PessoaRepository;
import com.cadastro.sistema.service.PessoaService;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceImpl implements PessoaService {

    private PessoaRepository pessoaRepository;

    public  PessoaServiceImpl(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public Pessoa buscarPessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Digite o seu nome");
        pessoa.setCpf("Ex: 000.000.000-00");
        pessoa.setData("Ex: 00/00/0000");
        pessoa.setRua("Ex: Rua São Francisco");
        pessoa.setNumero(514);
        pessoa.setBairro("Ex: Centro");
        pessoa.setCidade("Ex: Ourinhos");
        pessoa.setEstado("Ex: SP");
        return pessoa;
    }

    @Override
    public Pessoa burcarTodos() {
        return null;
    }

    @Override
    public Pessoa salvar(Pessoa pessoa){
        PessoaEntity pessoaEntity = new PessoaEntity();
        pessoaEntity.setNome(pessoa.getNome());
        pessoaEntity.setCpf(pessoa.getCpf());
        pessoaEntity.setData(pessoa.getData());
        pessoaEntity.setEmail(pessoa.getEmail());
        pessoaEntity.setCep(pessoa.getCep());
        pessoaEntity.setRua(pessoa.getRua());
        pessoaEntity.setNumero(pessoa.getNumero());
        pessoaEntity.setBairro(pessoa.getBairro());
        pessoaEntity.setCidade(pessoa.getCidade());
        pessoaEntity.setEstado(pessoa.getEstado());
        PessoaEntity retorno = this.pessoaRepository.save(pessoaEntity);

        Pessoa pessoaRetorno = new Pessoa();
        pessoaRetorno.setCodigo(retorno.getCodigo());
        pessoaRetorno.setNome(retorno.getNome());
        pessoaRetorno.setCpf(retorno.getCpf());
        pessoaRetorno.setData(retorno.getData());
        pessoaRetorno.setEmail(retorno.getEmail());
        pessoaRetorno.setCep(retorno.getCep());
        pessoaRetorno.setRua(retorno.getRua());
        pessoaRetorno.setNumero(retorno.getNumero());
        pessoaRetorno.setBairro(retorno.getBairro());
        pessoaRetorno.setCidade(retorno.getCidade());
        pessoaRetorno.setEstado(retorno.getEstado());

        return pessoaRetorno;
    }
}
