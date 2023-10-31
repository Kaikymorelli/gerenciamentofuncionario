package com.projetofuncionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetofuncionario.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
