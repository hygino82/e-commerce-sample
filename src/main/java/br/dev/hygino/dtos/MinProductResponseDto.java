package br.dev.hygino.dtos;

import java.math.BigDecimal;

public record MinProductResponseDto(
    Long id,
    String name,
    String brand,
    BigDecimal price,
    int inventory,
    String description
) {
}