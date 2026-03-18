package com.ueg.br.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "dataHoraInicio", nullable = false)
    private LocalDateTime dataHoraInicio;

    @Column(name = "dataHoraFinal", nullable = false)
    private LocalDateTime dataHoraFinal;

    @Column(name = "requerDeslocamento", nullable = false)
    private Boolean requerDeslocamento;

    @ManyToMany
    @JoinTable(
        name = "evento_profissional",
        joinColumns = @JoinColumn(name = "evento_id"),
        inverseJoinColumns = @JoinColumn(name = "profissional_id")
    )
    private List<Profissional> profissionais;

}
