package dev.cryss.partial_update.dto;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private Long id;
    @NotBlank(message = "This field is empty.")
    private String name;

    private String phone;
    private String phone97;
    private String phone98;
    private String phone99;
}
