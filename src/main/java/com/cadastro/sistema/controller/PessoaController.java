package com.cadastro.sistema.controller;

import com.cadastro.sistema.model.Pessoa;
import com.cadastro.sistema.service.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping
    public ResponseEntity<Pessoa> buscarPessoa(){
        Pessoa pessoa = this.pessoaService.buscarPessoa();
        return ResponseEntity.ok(pessoa);
    }

    @PostMapping
    public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa){
        Pessoa retorno = this.pessoaService.salvar(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(retorno);
    }

}
