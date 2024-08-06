package dev.cryss.partial_update.configuration;


import dev.cryss.partial_update.repository.CustomerRepository;
import dev.cryss.partial_update.service.CustomerService;
import dev.cryss.partial_update.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
    @Bean
    CustomerService customerService(CustomerRepository customerRepository){
        return new CustomerServiceImpl (customerRepository);
    }
}
