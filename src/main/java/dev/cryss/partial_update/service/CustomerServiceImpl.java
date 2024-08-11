package dev.cryss.partial_update.service;

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

    public CustomerResponseDto updateCustomer(Long id, String phone){



        Customer customer = repo.findById (id).orElseThrow (()-> new RuntimeException ("Id nof found"+id));

        //Atualiza 

        return CustomerMapper.INSTANCE.toCustomerResponseDto (repo.save (customer)) ;

    }

}
