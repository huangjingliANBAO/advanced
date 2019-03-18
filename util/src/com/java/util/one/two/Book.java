package com.java.util.one.two;

public class Book {
    private Integer id;
    private String name;
    private Double pirce;

    public Book(Integer id, String name, Double pirce) {
        this.id = id;
        this.name = name;
        this.pirce = pirce;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPirce() {
        return pirce;
    }

    public void setPirce(Double pirce) {
        this.pirce = pirce;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pirce=" + pirce +
                '}';
    }
}
