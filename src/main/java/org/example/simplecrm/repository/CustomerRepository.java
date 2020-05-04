package org.example.simplecrm.repository;

import org.example.simplecrm.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository to interact with our H2 database.
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
