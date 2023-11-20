package com.desafio.ninja.cadastro;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "cadastros")
@Entity(name = "cadastros")
//@Getter // Não funcionou.
@NoArgsConstructor
@AllArgsConstructor
// @EqualsAndHashCode(of = "id") // Não funcionou.
public class Cadastro {
    // Definindo a chave primário da tabela.
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String usuario;
    private String email;
    private String senha;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
