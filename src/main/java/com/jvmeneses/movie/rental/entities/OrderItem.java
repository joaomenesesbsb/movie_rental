package com.jvmeneses.movie.rental.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem {
    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();
    private Double price;
    private Integer days;

    public OrderItem() {
    }

    public OrderItem(Order order, Book book, Double price, Integer days) {
        id.setOrder(order);
        id.setBook(book);
        this.price = price;
        this.days = days;
    }

    public Order getOrder() {
        return id.getOrder();

    }
    public void setOrder(Order order) {
        id.setOrder(order);
    }
    public Book getBook() {
        return id.getBook();
    }

    public void setBook(Book book) {
        id.setBook(book);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
}
