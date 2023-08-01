package com.jvmeneses.movie.rental.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private Double price;
    @Column(columnDefinition = "TEXT")
    private String description;
    @ManyToMany
    @JoinTable(name = "tb_book_genre",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre>  genres = new ArrayList<>();
    @OneToMany(mappedBy = "id.book")
    private Set<OrderItem> items = new HashSet<>();

    public Book() {
    }

    public Book(Long id, String title, String author, Double price, String description) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public Set<OrderItem> getItems() {
        return items;
    }
}
