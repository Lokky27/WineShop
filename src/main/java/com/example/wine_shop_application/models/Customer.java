package com.example.wine_shop_application.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "customers")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Long customerId;

    private String name;

    @Column(name = "customer_since")
    private LocalDate customerSince;

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId != customer.customerId
                && (name == customer.name || (name != null && name.equals(customer.getName())))
                && (customerSince == customer.customerSince || (customerSince != null && customerSince.equals(customer.getCustomerSince())));
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0: name.hashCode());
        result = prime * result + customerId.hashCode();
        result = prime * result + ((customerSince == null) ? 0 : customerSince.hashCode());
        return result;
    }
}
