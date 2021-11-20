package com.trabalhop1lpd.trabalhop1lpd.model.repository;


import com.trabalhop1lpd.trabalhop1lpd.model.entity.Conteudo;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;


public class ConteudoRepository {
    private JdbcTemplate jdbcTemplate;

    public ConteudoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Conteudo cadastrar(Conteudo conteudo) throws Exception {
        String sql = "INSERT INTO conteudo(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao) VALUES (?, ?, ?, ?, ?, ?)";
        int insert = jdbcTemplate.update(sql,
                conteudo.getId(),
                conteudo.getNome(),
                conteudo.getDescricao(),
                conteudo.getFotoUrl(),
                conteudo.getDataCadastro(),
                conteudo.getDataUltimaAtualizacao());

        if (insert == 1) {
            return conteudo;
        }

        throw new Exception("Erro ao fazer o cadastro");
    }

    public List<Conteudo> buscar(Integer id) throws Exception {
        String sql = "SELECT * FROM CONTEUDO WHERE id = ?";
        List<Conteudo> search = (List<Conteudo>) jdbcTemplate.query(sql, new ConteudoMapper(), id);

        if (search.size() > 0) {
            return (List<Conteudo>) jdbcTemplate.query(sql, new Object[]{id}, new ConteudoMapper());
        }
        throw new Exception("Conteúdo não encontrado");
    }

    public List<Conteudo> buscarPorNome(String nome) {
        if (nome != null) {
            return jdbcTemplate.query("SELECT * FROM CONTEUDO WHERE nome = ?", new ConteudoMapper(), nome);
        }
        return null;
    }

    public List<Conteudo> buscarConteudos() throws Exception {
        String sql = "SELECT * FROM CONTEUDO";
        List<Conteudo> search = (List<Conteudo>) jdbcTemplate.query(sql, new ConteudoMapper());

        if (search.size() > 0) {
            return (List<Conteudo>) jdbcTemplate.query(sql, new Object[]{}, new ConteudoMapper());
        }
        throw new Exception("Conteúdo não encontrado");
    }
}
