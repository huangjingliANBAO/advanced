package com.soft1841.list;

public class Country implements Comparable<Country> {
    private String country;
    private Integer area;

    public Country(String country, Integer area) {
        this.country = country;
        this.area = area;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    @Override
    public int compareTo(Country country) {
        return this.getArea() - country.getArea() ;
    }
}
