# GerenciadorDeAgendasSECOM
Um gerenciador de agenda de profissionais de comunicação, um projeto simples para a aprovação na matéria de desenvolvimento web


classDiagram
    direction TB

    class Profissional {
        +Long id
        +String nome
        +LocalDate dataAdmissao
        +Boolean isVideomaker
        +Integer cargaHorariaSemanal
    }

    class Evento {
        +Long id
        +String titulo
        +LocalDateTime dataHoraInicio
        +Boolean requerDeslocamento
        +Double orcamentoPrevisto
    }

    class Equipamento {
        +Long id
        +String modelo
        +LocalDate dataAquisicao
        +Boolean disponivel
        +Integer pesoGramas
    }

    %% Relacionamentos mapeados para as próximas etapas (OBS do escopo)
    Evento "1" --> "*" Profissional : aloca
    Evento "1" --> "*" Equipamento : utiliza
