package com.ueg.br.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

public class Equipamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "modelo", nullable = false)
    private String modelo;

    @Column(name = "dataAquisicao", nullable = false)
    private LocalDate dataAquisicao;

    @Column(name = "isDisponivel", nullable = false)
    private Boolean isDisponivel;

    @Column(name = "pesoGramas", nullable = false)
    private Integer pesoGramas;

    @ManyToMany(mappedBy = "equipamentos")
    @JsonIgnore
    private List<Evento> eventos;
}
