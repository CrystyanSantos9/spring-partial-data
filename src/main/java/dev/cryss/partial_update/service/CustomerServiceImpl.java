package dev.cryss.partial_update.service;

import dev.cryss.partial_update.dto.CustomerDto;
import dev.cryss.partial_update.dto.CustomerResponseDto;
import dev.cryss.partial_update.entity.Customer;
import dev.cryss.partial_update.mapper.CustomerMapper;
import dev.cryss.partial_update.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repo;

    public CustomerResponseDto addCustomer(String name){

        Customer customer = Customer
                .builder ()
                .name (name)
                .build ();

      return CustomerMapper.INSTANCE.toCustomerResponseDto (repo.save (customer)) ;

    }

    @Override
    public CustomerResponseDto updateCustomer(Long id, String phone) {
        Customer storedCustomer = repo.findById (id)
                .orElseThrow (() -> new RuntimeException (String.format ("User with id %s not found.", id)));


        return CustomerMapper.INSTANCE
                .toCustomerResponseDto (repo.save (storedCustomer));

    }

    @Override
    public CustomerResponseDto updateCustomerWithMapping(Long id, CustomerDto dto) {
        Customer storedCustomer = repo.findById (id)
                .orElseThrow (() -> new RuntimeException (String.format ("User with id %s not found.", id)));

         CustomerMapper.INSTANCE
                .updateCustomerFromDto (dto, storedCustomer);

        return CustomerMapper.INSTANCE
                .toCustomerResponseDto (repo.save (storedCustomer));

    }

}
