package com.trabalhop1lpd.trabalhop1lpd.controller;

import com.trabalhop1lpd.trabalhop1lpd.model.entity.Conteudo;
import com.trabalhop1lpd.trabalhop1lpd.model.repository.ConteudoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/conteudo")
public class ConteudoController {
    private ConteudoRepository produtoRepository;

    public ConteudoController(JdbcTemplate jdbcTemplate) {
        produtoRepository = new ConteudoRepository(jdbcTemplate);
    }

    @CrossOrigin("*")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Conteudo cadastrar(@RequestBody Conteudo produto) throws Exception {
        return produtoRepository.cadastrar(produto);
    }

    @CrossOrigin("*")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public List<Conteudo> buscar(@PathVariable Integer id) throws Exception {
        return produtoRepository.buscar(id);
    }

    @CrossOrigin("*")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/busca-nome")
    public List<Conteudo> buscarPorNome(@RequestParam(required = false) String nome) {
        return produtoRepository.buscarPorNome(nome);
    }

    @CrossOrigin("*")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<Conteudo> buscarConteudos() throws Exception {
        return produtoRepository.buscarConteudos();
    }
}