package com.jvmeneses.movie.rental.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class User {

    private Long id;
    private String name;
    private String cpf;
    private String email;
    private String phone;
    private String password;
    private Boolean restriction;

    private LocalDate birthDate;
    private Set<Role> roles = new HashSet<>();

    public User() {
    }

    public User(Long id, String name, String cpf, String email, String phone, String password, Boolean restriction, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.restriction = restriction;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getRestriction() {
        return restriction;
    }

    public void setRestriction(Boolean restriction) {
        this.restriction = restriction;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Role> getRoles() {
        return roles;
    }

}
