package org.sid.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.sid.customerservice.entities.Customer;
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
