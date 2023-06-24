package org.sid.billingservice.repository;

import feign.Param;
import org.sid.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface BillRepository extends JpaRepository<Bill,Long> {

    @RestResource(path = "/byCustomerId")
    List<Bill> getCustomerById(@Param("customerId") Long customerId);
}
