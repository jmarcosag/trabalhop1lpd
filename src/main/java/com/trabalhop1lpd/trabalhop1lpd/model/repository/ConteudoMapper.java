package com.trabalhop1lpd.trabalhop1lpd.model.repository;

import com.trabalhop1lpd.trabalhop1lpd.model.entity.Conteudo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class ConteudoMapper implements RowMapper<Conteudo> {

    @Override
    public Conteudo mapRow(ResultSet resultSet, int i) throws SQLException {
        Conteudo conteudo = new Conteudo();
        conteudo.setId(resultSet.getInt("id"));
        conteudo.setNome(resultSet.getString("nome"));
        conteudo.setDescricao(resultSet.getString("descricao"));
        conteudo.setFotoUrl(resultSet.getString("fotourl"));
        conteudo.setDataCadastro(LocalDate.from(resultSet.getTimestamp("datacadastro").toLocalDateTime()));
        conteudo.setDataUltimaAtualizacao(LocalDate.from(resultSet.getTimestamp("dataultimaatualizacao").toLocalDateTime()));

        return conteudo;
    }
}
