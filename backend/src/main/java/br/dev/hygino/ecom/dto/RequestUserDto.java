package br.dev.hygino.ecom.dto;

import br.dev.hygino.ecom.enums.UserRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestUserDto(
        @Email String email,
        @NotBlank String name,
        @NotBlank String password,
        @NotNull UserRole role) {

}
