package dev.cryss.partial_update.mapper;

import dev.cryss.partial_update.dto.ContacPhoneDto;
import dev.cryss.partial_update.dto.ContacPhoneResponseDto;
import dev.cryss.partial_update.dto.CustomerDto;
import dev.cryss.partial_update.dto.CustomerResponseDto;
import dev.cryss.partial_update.entity.ContactPhone;
import dev.cryss.partial_update.entity.Customer;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import java.util.Objects;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper (CustomerMapper.class);

    CustomerResponseDto toCustomerResponseDto(Customer customer);

//    Mapeamento entidade para Dto de Resposta
    ContacPhoneResponseDto toContacPhoneResponseDto(ContactPhone phone);
//    Set<ContacPhoneResponseDto> toContacPhoneResponseDtoList(Set<ContactPhone> listPhone);

//    Mapeamento Dto de entrada para Dto entidade
    @Mapping (source = "phone", target = "phone", qualifiedByName = "contactPhoneIntToString")
    ContactPhone toContactPhone(ContacPhoneDto dto);
//   Set<ContactPhone> toContactPhoneList(List<ContacPhoneDto> dtoList);

    @Named ("contactPhoneIntToString")
    public static String contactPhoneIntToString(int phone){
            if(Objects.nonNull (phone)){
                return String.valueOf (phone);
            }
            return null;
    }

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateCustomerFromDto(CustomerDto dto, @MappingTarget Customer entity);

}
