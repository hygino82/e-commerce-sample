package br.dev.hygino.mappers;

import org.mapstruct.Mapper;

import br.dev.hygino.dtos.MinProductResponseDto;
import br.dev.hygino.models.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    MinProductResponseDto toMinProductResponseDto(Product product);
}
