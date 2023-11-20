package com.desafio.ninja.cadastro;

import org.springframework.data.jpa.repository.JpaRepository;

// Interface criada para se conectar com o nosso Banco de Dados e pegar os dados exitentes nele.
public interface CadastroRepositorio extends JpaRepository <Cadastro, Long>{

}
