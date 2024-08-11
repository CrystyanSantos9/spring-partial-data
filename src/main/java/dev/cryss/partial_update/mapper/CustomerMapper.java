package dev.cryss.partial_update.mapper;

import dev.cryss.partial_update.dto.CustomerDto;
import dev.cryss.partial_update.dto.CustomerResponseDto;
import dev.cryss.partial_update.entity.Customer;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper (CustomerMapper.class);


    CustomerResponseDto toCustomerResponseDto(Customer customer);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateCustomerFromDto(CustomerDto dto, @MappingTarget Customer entity);


}
