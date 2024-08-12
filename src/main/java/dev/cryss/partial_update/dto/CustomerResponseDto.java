package dev.cryss.partial_update.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponseDto {

    private Long id;

    private String name;

    private Set<ContacPhoneResponseDto> contactPhones;

}
