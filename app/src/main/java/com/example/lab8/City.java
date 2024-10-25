package com.example.lab8;

public class City implements Comparable<City>{

    private String city;
    private String province;
    private int cityHashCode;

    public City(String city, String province){
        this.city = city;
        this.province = province;
        this.cityHashCode = hashCode();
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    //Overrides are from my Lab 6 implementation
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof City)) {
            return false;
        }

        City c = (City) o;

        return city.equals(c.getCityName())
                && province.equals(c.getProvinceName());
    }
    public int getHashCode() {
        return this.cityHashCode;
    }
}
