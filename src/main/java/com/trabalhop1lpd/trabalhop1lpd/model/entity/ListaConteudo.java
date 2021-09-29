package com.trabalhop1lpd.trabalhop1lpd.model.entity;

import java.util.List;

public class ListaConteudo {

    private Usuario usuario;
    private List<Conteudo> conteudoListaUsuario;

    public ListaConteudo(Usuario usuario, List<Conteudo> conteudoListaUsuario) {
        this.usuario = usuario;
        this.conteudoListaUsuario = conteudoListaUsuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Conteudo> getConteudoListaUsuario() {
        return conteudoListaUsuario;
    }

    public void setConteudoListaUsuario(List<Conteudo> conteudoListaUsuario) {
        this.conteudoListaUsuario = conteudoListaUsuario;
    }
}
