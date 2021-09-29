package com.trabalhop1lpd.trabalhop1lpd.model.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Estudio {
    private Integer id;
    private String nomeFantasia;
    private LocalDate dataCadastro;
    private LocalTime horaCadastro;
    private LocalDate dataUltimaAtualizacao;

    public Estudio(Integer id, String nomeFantasia, LocalDate dataCadastro, LocalTime horaCadastro, LocalDate dataUltimaAtualizacao) {
        this.id = id;
        this.nomeFantasia = nomeFantasia;
        this.dataCadastro = dataCadastro;
        this.horaCadastro = horaCadastro;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getnomeFantasia() {
        return nomeFantasia;
    }

    public void setnomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalTime getHoraCadastro() {
        return horaCadastro;
    }

    public void setHoraCadastro(LocalTime horaCadastro) {
        this.horaCadastro = horaCadastro;
    }

    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }
}

