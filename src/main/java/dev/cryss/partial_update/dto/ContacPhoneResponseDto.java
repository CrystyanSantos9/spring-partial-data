package dev.cryss.partial_update.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContacPhoneResponseDto {

    private Long id;

    private String phone;
}
