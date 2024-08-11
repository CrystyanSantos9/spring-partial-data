package dev.cryss.partial_update.service;

import dev.cryss.partial_update.dto.CustomerDto;
import dev.cryss.partial_update.dto.CustomerResponseDto;


public interface CustomerService {

     CustomerResponseDto addCustomer(String name);

    CustomerResponseDto updateCustomer(Long id, String name);

    CustomerResponseDto updateCustomerWithMapping(Long id, CustomerDto dto);


}
