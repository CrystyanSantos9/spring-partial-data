package dev.cryss.partial_update.repository;

import dev.cryss.partial_update.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findById(long id);
}
