package com.github.Alexgcosta.controle_ponto_acesso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.Alexgcosta.controle_ponto_acesso.entities.Calendario;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {

}
