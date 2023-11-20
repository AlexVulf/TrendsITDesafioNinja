package com.desafio.ninja.controller;
import com.desafio.ninja.cadastro.Cadastro;
import com.desafio.ninja.cadastro.CadastroRepositorio;
import com.desafio.ninja.cadastro.CadastroRepositorioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Para indicar ao Spring que esta classe é um Controller, manstando esta no Controller.
@RestController
@RequestMapping("cadastro")
public class CadastroController {
    // Anotação usada para fazer a injeção de Dependência dentro desta Classe, através do Spring.
    @Autowired
    private CadastroRepositorio repositorio;
    // Criar um Método para pegar todos os dados que estão em nosso Bonco de Dados
    // Classe para adiocionar an postagens do usuário.
    //@PostMapping
    //public void salvalPostagem(@RequestBody CadastroRecebidoDTO data){


    @GetMapping
    public List<CadastroRepositorioDTO> buscarDados(){
        List<CadastroRepositorioDTO> cadastroList = repositorio.findAll().stream()
                .map(CadastroRepositorioDTO::new).toList();
        return cadastroList;
    }
}
