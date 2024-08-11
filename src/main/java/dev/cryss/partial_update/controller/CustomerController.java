package dev.cryss.partial_update.controller;

import dev.cryss.partial_update.dto.CustomerDto;
import dev.cryss.partial_update.dto.CustomerResponseDto;
import dev.cryss.partial_update.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/customers")
@RestController
@Log4j2
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerResponseDto> addCustomer(@RequestBody CustomerDto request) {

        return ResponseEntity.ok (customerService.addCustomer (request.getName ()));

    }

    @PutMapping("/{customerId}")
    public ResponseEntity<CustomerResponseDto> updateCustomer(
            @PathVariable(value = "customerId") Long customerId,
            @RequestBody CustomerDto request) {

        return ResponseEntity.ok (customerService.updateCustomerWithMapping (customerId, request));

    }

}
