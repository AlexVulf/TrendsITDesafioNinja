package com.desafio.ninja.cadastro;

public record CadastroRepositorioDTO(Integer id, String nome, String usuario, String email, String senha){
    public CadastroRepositorioDTO(Cadastro cadastro){
        this(cadastro.getId(), cadastro.getNome(), cadastro.getUsuario(), cadastro.getEmail(), cadastro.getSenha());
    }
}
