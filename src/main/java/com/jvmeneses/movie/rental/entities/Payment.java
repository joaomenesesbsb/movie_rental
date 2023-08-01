package com.jvmeneses.movie.rental.entities;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "tb_payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
     private Instant instant;
     private TypeOfPayment typeOfPayment;
    @OneToOne
    @MapsId
    private Order order;

    public Payment() {
    }

    public Payment(Long id, Instant instant, TypeOfPayment typeOfPayment, Order order) {
        this.id = id;
        this.instant = instant;
        this.typeOfPayment = typeOfPayment;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public TypeOfPayment getTypeOfPayment() {
        return typeOfPayment;
    }

    public void setTypeOfPayment(TypeOfPayment typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
