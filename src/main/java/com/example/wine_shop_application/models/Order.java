package com.example.wine_shop_application.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "orders")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "date_of_purchase")
    private LocalDate dateOdPurchase;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId
                && (dateOdPurchase == order.dateOdPurchase || (dateOdPurchase != null && dateOdPurchase.equals(order.getDateOdPurchase())))
                && (customer == order.customer || (customer != null && customer.equals(order.getCustomer())));
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + orderId.hashCode();
        result = prime * result + ((dateOdPurchase  == null) ? 0 : dateOdPurchase.hashCode());
        result = prime * result + ((customer == null) ? 0 : customer.hashCode());
        return result;
    }
}
