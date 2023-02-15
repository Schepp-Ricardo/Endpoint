package com.viavarejotest.viavarejotest.service;

import com.viavarejotest.viavarejotest.model.Produto;
import com.viavarejotest.viavarejotest.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    public ProdutoRepository produtoRepository;

    public List<Produto> findAllProductsService() {
        return produtoRepository.findAll();
    }

    public Produto createProductService(Produto p) {
        return produtoRepository.save(p);
    }
}
