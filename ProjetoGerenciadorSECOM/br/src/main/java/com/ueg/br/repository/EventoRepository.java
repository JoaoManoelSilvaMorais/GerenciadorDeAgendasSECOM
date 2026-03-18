package com.ueg.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ueg.br.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
