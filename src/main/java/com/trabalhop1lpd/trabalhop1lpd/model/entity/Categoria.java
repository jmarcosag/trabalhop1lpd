package com.trabalhop1lpd.trabalhop1lpd.model.entity;


import java.util.List;

public class Categoria {
    private Integer id;
    private String nome;
    private String descricao;
    private List<Conteudo> conteudoList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Conteudo> getConteudoList() {
        return conteudoList;
    }

    public void setProdutoList(List<Conteudo> produtoList) {
        this.conteudoList = produtoList;
    }
}

