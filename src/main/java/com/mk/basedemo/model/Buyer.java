package com.mk.basedemo.model;

public class Buyer {
private Long id;
private String name;

    public Buyer(Long id, String name, String country, int tocen) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.tocen = tocen;
    }

    private String country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", tocen=" + tocen +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTocen(int tocen) {
        this.tocen = tocen;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getTocen() {
        return tocen;
    }

    private int tocen;



}
