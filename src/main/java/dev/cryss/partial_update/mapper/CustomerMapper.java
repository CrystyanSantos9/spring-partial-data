package dev.cryss.partial_update.mapper;

import dev.cryss.partial_update.dto.CustomerResponseDto;
import dev.cryss.partial_update.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper (CustomerMapper.class);


    CustomerResponseDto toCustomerResponseDto(Customer customer);


}
