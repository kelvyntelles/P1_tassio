package com.br.prova.p1_tassio.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PromocaoItem {

    private TabelaPromocao tabelaPromocao;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String valorPromocao;

    public PromocaoItem(TabelaPromocao tabelaPromocao, Long id, String valorPromocao) {
        this.tabelaPromocao = tabelaPromocao;
        this.id = id;
        this.valorPromocao = valorPromocao;
    }

    public TabelaPromocao getTabelaPromocao() {
        return tabelaPromocao;
    }

    public void setTabelaPromocao(TabelaPromocao tabelaPromocao) {
        this.tabelaPromocao = tabelaPromocao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValorPromocao() {
        return valorPromocao;
    }

    public void setValorPromocao(String valorPromocao) {
        this.valorPromocao = valorPromocao;
    }
}
