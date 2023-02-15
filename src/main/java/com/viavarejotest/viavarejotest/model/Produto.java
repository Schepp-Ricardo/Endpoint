package com.viavarejotest.viavarejotest.model;

import javax.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long produto_id;
    private Long produto_codigo;
    private String produto_nome;
    private Double produto_valor;

    public Produto(Long produto_id, Long produto_codigo, String produto_nome, Double produto_valor) {
        this.produto_id = produto_id;
        this.produto_codigo = produto_codigo;
        this.produto_nome = produto_nome;
        this.produto_valor = produto_valor;
    }

    public Produto() {
    }

    public Long getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(Long produto_id) {
        this.produto_id = produto_id;
    }

    public Long getProduto_codigo() {
        return produto_codigo;
    }

    public void setProduto_codigo(Long produto_codigo) {
        this.produto_codigo = produto_codigo;
    }

    public String getProduto_nome() {
        return produto_nome;
    }

    public void setProduto_nome(String produto_nome) {
        this.produto_nome = produto_nome;
    }

    public Double getProduto_valor() {
        return produto_valor;
    }

    public void setProduto_valor(Double produto_valor) {
        this.produto_valor = produto_valor;
    }
}
