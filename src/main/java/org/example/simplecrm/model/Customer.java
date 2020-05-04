package org.example.simplecrm.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * A customer of our company.
 */
@Entity
public class Customer {

    /**
     * The unique identifier for the customer.
     */
    @Id
    private long customerId;

    /**
     * The customer's name.
     */
    private String name;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(final long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public String toString() {
        return "Customer{"
                + "customerId=" + customerId
                + ", name='" + name + '\''
                + '}';
    }
}
