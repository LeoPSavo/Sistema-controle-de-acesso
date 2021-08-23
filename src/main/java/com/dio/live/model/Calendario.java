package com.dio.live.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendario {
    private long id;
    private String descricao;

    private TipoData tipoData;
    private LocalDateTime dataEspecial;
}
