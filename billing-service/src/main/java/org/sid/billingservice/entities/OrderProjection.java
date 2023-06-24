package org.sid.billingservice.entities;

import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "fillOrder",types= Bill.class)
public interface OrderProjection {
    Long getId();
    Date getBillingDate();
    Long getCustomerID();

}
