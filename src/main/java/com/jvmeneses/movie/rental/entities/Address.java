package com.jvmeneses.movie.rental.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String number;
    private String country;
    @Column(unique = true)
    private Integer  postCode;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    public Address() {
    }

    public Address(Long id, String city, String number, String country, Integer postCode, User client) {
        this.id = id;
        this.city = city;
        this.number = number;
        this.country = country;
        this.postCode = postCode;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }
}
