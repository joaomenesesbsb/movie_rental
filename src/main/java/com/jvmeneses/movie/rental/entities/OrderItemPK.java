package com.jvmeneses.movie.rental.entities;

public class OrderItemPK {

    private Order Order;
    private Book book;

    public OrderItemPK() {
    }

    public com.jvmeneses.movie.rental.entities.Order getOrder() {
        return Order;
    }

    public void setOrder(com.jvmeneses.movie.rental.entities.Order order) {
        Order = order;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
