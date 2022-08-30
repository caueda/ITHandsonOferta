package com.example.ithandsonoferta.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Produto {
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private String imageUrl;
}
