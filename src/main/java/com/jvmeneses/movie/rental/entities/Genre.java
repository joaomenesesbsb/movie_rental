package com.jvmeneses.movie.rental.entities;

public class Genre {
    private Long id;
    private String name;

    private Integer likes;

    public Genre() {
    }

    public Genre(Long id, String name, Integer likes) {
        this.id = id;
        this.name = name;
        this.likes = likes;
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

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
