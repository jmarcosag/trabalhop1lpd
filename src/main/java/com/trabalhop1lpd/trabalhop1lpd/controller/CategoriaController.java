package com.trabalhop1lpd.trabalhop1lpd.controller;

import com.trabalhop1lpd.trabalhop1lpd.model.entity.Categoria;
import com.trabalhop1lpd.trabalhop1lpd.model.entity.Conteudo;
import com.trabalhop1lpd.trabalhop1lpd.model.repository.CategoriaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    private CategoriaRepository categoriaRepository;

    public CategoriaController(JdbcTemplate jdbcTemplate) {
        categoriaRepository = new CategoriaRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public List<Categoria> buscar(@PathVariable Integer id) throws Exception {
        return categoriaRepository.buscar(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}/produto")
    public List<Conteudo> buscarConteudoPorNome(@PathVariable int id, @RequestParam(required = false) String nome) {
        return categoriaRepository.buscarConteudoPorNome(id, nome);
    }
}
