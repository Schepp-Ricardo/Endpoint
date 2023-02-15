package com.viavarejotest.viavarejotest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CondicaoDePagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long condicaoDePagamentoId;
    private Double valorDeEntrada;
    private int qntdeParcelas;
}
