package com.viavarejotest.viavarejotest.controllers;

import com.viavarejotest.viavarejotest.model.Produto;
import com.viavarejotest.viavarejotest.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    public ProdutoService produtoService;

    @GetMapping
    public List<Produto> findAllProductsController() {
        return produtoService.findAllProductsService();
    }

    @PostMapping
    public Produto createProductController(@RequestBody Produto p) {
        return produtoService.createProductService(p);
    }
}
