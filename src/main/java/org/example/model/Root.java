package org.example.model;

public class Root {
    private String name;
    private String country;
    private String city;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "" +
                "name = '" + name + '\'' +
                ", country = '" + country + '\'' +
                ", city = '" + city + '\'' +
                ", age = '" + age + '\'' ;
    }
}
