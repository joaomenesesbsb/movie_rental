package com.jvmeneses.movie.rental.entities;

public class Address {

    private Long id;
    private String city;
    private String number;
    private String country;
    private Integer  postCode;

    public Address() {
    }

    public Address(Long id, String city, String number, String country, Integer postCode) {
        this.id = id;
        this.city = city;
        this.number = number;
        this.country = country;
        this.postCode = postCode;
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
}
