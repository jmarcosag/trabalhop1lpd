package com.trabalhop1lpd.trabalhop1lpd.model.repository;

import com.trabalhop1lpd.trabalhop1lpd.model.entity.Categoria;
import com.trabalhop1lpd.trabalhop1lpd.model.entity.Conteudo;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

public class CategoriaRepository {
    private JdbcTemplate jdbcTemplate;

    public CategoriaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Categoria> buscar(Integer id) throws Exception {
        String sql = "SELECT * FROM categoria WHERE id = ?";
        List<Categoria> search = (List<Categoria>) jdbcTemplate.query(sql, new CategoriaMapper(), id);
        if (search.size() > 0) {
            return (List<Categoria>) jdbcTemplate.query(sql, new Object[]{id}, new CategoriaMapper());
        }
        throw new Exception("Categoria não encontrada");
    }

    public List<Conteudo> buscarConteudoPorNome(Integer id, String nome) {
        if (nome != null) {
            return jdbcTemplate.query("select p.* FROM produto p INNER JOIN categoriaProduto cp ON cp.id_produto = p.id WHERE cp.id_categoria = ? AND p.nome = ?",
                    new ConteudoMapper(), id, nome);
        }
        return null;
    }
}

