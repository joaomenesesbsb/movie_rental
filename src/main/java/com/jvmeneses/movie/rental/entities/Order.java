package com.jvmeneses.movie.rental.entities;

import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Order {

    private Long id;
    private OrderStatus status;
    private Instant instant;

    private User user;

    private Payment payment;
    private Set<OrderItem> items = new HashSet<>();

    public Order() {
    }

    public Order(Long id, OrderStatus status, Instant instant, User user, Payment payment) {
        this.id = id;
        this.status = status;
        this.instant = instant;
        this.user = user;
        this.payment = payment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Set<OrderItem> getItems() {
        return items;
    }

    public List<Book> getBooks(){
    return items.stream().map(x -> x.getBook()).toList();
    }
}
