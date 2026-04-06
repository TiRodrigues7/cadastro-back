package com.cadastro.sistema.controller;

import com.cadastro.sistema.model.Produto;
import com.cadastro.sistema.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<Produto> buscarProduto() {
        Produto produto = this.produtoService.buscarProduto();
        return ResponseEntity.ok(produto);
    }

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto) {
        Produto retorno = this.produtoService.salvar(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(retorno);
    }
}
