package com.jvmeneses.movie.rental.entities;

import java.time.Instant;

public class Payment {
    private Long id;
     private Instant instant;
     private TypeOfPayment typeOfPayment;

    public Payment() {
    }

    public Payment(Long id, Instant instant, TypeOfPayment typeOfPayment) {
        this.id = id;
        this.instant = instant;
        this.typeOfPayment = typeOfPayment;
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
}
